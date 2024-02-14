
import java.util.*


fun main(vararg args: String) {

    val s1 = "listen"
    val s2 = "silent"

    /*val a1 = s1.toCharArray()
    val a2 = s2.toCharArray()

    val n = readln().toInt() // Read the number of lines
    val inputLines = List(n) { readln() } // Read the input lines

    val reversedLines = inputLines.map { line ->
        // Split each line into words using space as the delimiter
        val words = line.split(" ")

        // Reverse the order of words and join them back together
        //val reversedLine = words.reversed().joinToString(" ")
        val reversedLine = reverseWordsInLine(words)

        reversedLine
    }*/

    // Print the reversed lines
    //reversedLines.forEach { println(it) }

    //println(areAnagram(a1,a2))

    val n = readln().toInt()
    val sequence = readln().split(" ").map { it.toInt() }

    val longestIncreasingSubsequence = findLongestIncreasingSubsequence(sequence)
    println(longestIncreasingSubsequence.joinToString(" "))
}


fun findLongestIncreasingSubsequence(sequence: List<Int>): List<Int> {
    val n = sequence.size
    val lisLength = IntArray(n) { 1 }
    val previousIndex = IntArray(n) { -1 }

    for (i in 1 until n) {
        for (j in 0 until i) {
            if (sequence[i] > sequence[j] && lisLength[i] < lisLength[j] + 1) {
                lisLength[i] = lisLength[j] + 1
                previousIndex[i] = j
            }
        }
    }

    var maxLength = 0
    var lastIndex = 0

    for (i in 0 until n) {
        if (lisLength[i] > maxLength) {
            maxLength = lisLength[i]
            lastIndex = i
        }
    }

    val longestIncreasingSubsequence = mutableListOf<Int>()
    var currentIndex = lastIndex

    while (currentIndex >= 0) {
        longestIncreasingSubsequence.add(sequence[currentIndex])
        currentIndex = previousIndex[currentIndex]
    }

    return longestIncreasingSubsequence.reversed()
}

fun reverseWordsInLine(words: List<String>): String {
    if (words.isEmpty()) {
        return ""
    }

    var reversedLine = words[words.size - 1]

    for (i in words.size - 2 downTo 0) {
        reversedLine += " " + words[i]
    }

    return reversedLine
}

fun areAnagram(str1: CharArray, str2: CharArray): Boolean {
    // Get lengths of both strings
    val n1 = str1.size
    val n2 = str2.size

    // If length of both strings is not same,
    // then they cannot be anagram
    if (n1 != n2) return false

    // Sort both strings
    Arrays.sort(str1)
    Arrays.sort(str2)

    // Compare sorted strings
    for (i in 0 until n1) if (str1[i] != str2[i]) return false
    return true
}
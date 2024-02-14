package basicmaths

fun main() {
    val a = intArrayOf(3, 10, 2, 1, 20)
    val n = a.size
    println("Length of lis is ${longestSubsequence(n, a)}")
}

val INT_MIN = -2147483648

fun f(idx: Int, prevIdx: Int, n: Int, a: IntArray, dp: Array<Array<Int>>): Int {
    if (idx == n) {
        return 0
    }
    if (dp[idx][prevIdx + 1] != -1) {
        return dp[idx][prevIdx + 1]
    }
    val notTake = 0 + f(idx + 1, prevIdx, n, a, dp)
    var take = INT_MIN
    if (prevIdx == -1 || a[idx] > a[prevIdx]) {
        take = 1 + f(idx + 1, idx, n, a, dp)
    }

    dp[idx][prevIdx + 1] = maxOf(take, notTake)
    return dp[idx][prevIdx + 1]
}

fun longestSubsequence(n: Int, a: IntArray): Int {
    val dp = Array(n + 1) { Array(n + 1) { -1 } }

    for (i in 0 until n + 1) {
        for (j in 0 until n + 1) {
            dp[i][j] = -1
        }
    }
    return f(0, -1, n, a, dp)
}
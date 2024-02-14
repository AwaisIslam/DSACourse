package basicmaths;

import java.util.Stack;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(12));
        System.out.println(checkBrackets("[{()}]"));
    }
    public static int reverseNumber(int n) {
        int reverse = 0;
        while(n!= 0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }

    public static boolean checkBrackets(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else if (ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if (ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

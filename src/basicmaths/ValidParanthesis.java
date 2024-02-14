package basicmaths;

import javax.xml.stream.events.Characters;
import java.util.Stack;

public class ValidParanthesis {

    public static boolean checkBrackets(String s){
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.pop();
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

    public static void main(String[] args) {
        checkBrackets("[{()}]");
    }

}

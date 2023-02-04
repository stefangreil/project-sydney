package at.greil.sydney.easy;

import java.util.Stack;

public class ValidParenthesesChecker {

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();

        if(chars.length <= 1) {
            return false;
        }
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                charStack.push(chars[i]);
            } else if (!charStack.isEmpty() && charStack.peek() == '(' && chars[i] == ')') {
                charStack.pop();
            } else if (!charStack.isEmpty() && charStack.peek() == '{' && chars[i] == '}') {
                charStack.pop();
            } else if (!charStack.isEmpty() && charStack.peek() == '[' && chars[i] == ']') {
                charStack.pop();
            } else {
                return false;
            }
        }
        return charStack.isEmpty();
    }
}

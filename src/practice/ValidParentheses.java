package practice;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> {
                    stack.push(')');
                }
                case '{' -> {
                    stack.push('}');
                }
                case '[' -> {
                    stack.push(']');
                }
                case ')' -> {
                    if (stack.isEmpty()) return false;
                    Character popped = stack.pop();
                    if (popped != ')') return false;
                }
                case '}' -> {
                    if (stack.isEmpty()) return false;
                    Character popped = stack.pop();
                    if (popped != '}') return false;
                }
                case ']' -> {
                    if (stack.isEmpty()) return false;
                    Character popped = stack.pop();
                    if (popped != ']') return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ValidParentheses.isValid("()"));
        System.out.println(ValidParentheses.isValid("()[]{}"));
        System.out.println(ValidParentheses.isValid("(]"));
        System.out.println(ValidParentheses.isValid("(({}))[][{}]"));
        System.out.println(ValidParentheses.isValid("]"));
        System.out.println(ValidParentheses.isValid("[][]}"));
        System.out.println(ValidParentheses.isValid("[][]("));
    }
}

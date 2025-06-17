package org.platform;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//        You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
//
//                The input string s is valid if and only if:
//
//        Every open bracket is closed by the same type of close bracket.
//        Open brackets are closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
//        Return true if s is a valid string, and false otherwise.
    }

    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    public boolean isValidUsingStack(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> closeToOpen = new java.util.HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


}
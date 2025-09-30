package com.stack;

import java.util.Stack;

public class HasMatchingParentheses {

    public static void main(String[] args) {

        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("(algorithm)"));
        System.out.println(hasMatchingParentheses("()(algorithm)))"));

    }


    public static boolean hasMatchingParentheses(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}

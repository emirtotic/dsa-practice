package com.arrays;

public class BackspaceStringCompare {

    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t));

    }

    private static boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }

    private static String check(String str) {

        StringBuilder sb = new StringBuilder();
        char[] array = str.toCharArray();

        for (char c : array) {

            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }

        }

        return sb.toString();
    }
}
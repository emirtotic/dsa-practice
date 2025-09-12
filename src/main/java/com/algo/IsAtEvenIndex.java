package com.algo;

public class IsAtEvenIndex {

    public static void main(String[] args) {

        String s = "HeLLo";

        System.out.println(isAtEvenIndex(s, 'L'));
        System.out.println(isAtEvenIndex(s, 'T'));
        System.out.println(isAtEvenIndex(s, 'H'));
        System.out.println(isAtEvenIndex(null, 'H'));
        System.out.println(isAtEvenIndex(null, 'H'));

    }

    public static boolean isAtEvenIndex(String s, char c) {

        if (s == null || s.isEmpty()) {
            return false;
        }

        for (int i = 0; i < s.length() / 2 + 1; i+=2) {
            if (s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }

}

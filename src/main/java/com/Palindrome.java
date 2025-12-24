package com;

import java.util.HashMap;

public class Palindrome {


    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {

        String normalized = normalizeString(s);

        if (normalized.isEmpty()) {
            return true;
        }

        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {

            if (normalized.charAt(left) == normalized.charAt(right)) {

                left++;
                right--;

            } else {
                return false;
            }

        }

        return true;
    }

    public static String normalizeString(String s) {

        StringBuilder sb = new StringBuilder();

        for (Character c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }

        return sb.toString().toLowerCase().trim();

    }


}
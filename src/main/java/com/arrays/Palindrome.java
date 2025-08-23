package com.arrays;

/**
Time complexity: O(n)
Space complexity: O(1)
 */
public class Palindrome {

    public static void main(String[] args) {

        String word = "Word";

        System.out.println(isPalindrome(word));

    }

    public static boolean isPalindrome(String word) {

        if (word == null) {
            return false;
        }

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {

            if (Character.toLowerCase(word.charAt(left)) != Character.toLowerCase(word.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

}

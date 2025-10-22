package com.patterns.twoPointer;

// Leetcode 2108
public class FindFirstPalindromicStringInTheArray {

    public static void main(String[] args) {

        String[] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));

    }

    public static String firstPalindrome(String[] words) {

        for (String word : words) {
            if (word.equalsIgnoreCase(reverse(word))) {
                return word;
            }
        }

        return "";
    }

    public static String reverse(String word) {

        char[] array = word.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        return new String(array);
    }

}

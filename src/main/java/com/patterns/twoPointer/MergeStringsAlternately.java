package com.patterns.twoPointer;

// Leetcode 1768
public class MergeStringsAlternately {

    public static void main(String[] args) {

        String word1 = "Eik";
        String word2 = "mro";

        String expected = "Emirko";

        String solution = mergeAlternately(word1, word2);

        System.out.println("Solution correct - " + expected.equals(solution));

    }


    public static String mergeAlternately(String word1, String word2) {

        int pointer = 0;
        StringBuilder sb = new StringBuilder();

        while (pointer < word1.length() || pointer < word2.length()) {

            if (pointer < word1.length()) {
                sb.append(word1.charAt(pointer));
            }

            if (pointer < word2.length()) {
                sb.append(word2.charAt(pointer));
            }

            pointer++;
        }

        return sb.toString();
    }

}

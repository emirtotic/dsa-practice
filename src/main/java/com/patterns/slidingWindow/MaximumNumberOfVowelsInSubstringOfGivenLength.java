package com.patterns.slidingWindow;

// Leetcode 1456
public class MaximumNumberOfVowelsInSubstringOfGivenLength {

    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;

        System.out.println(maxVowels(s, k));


    }

    public static int maxVowels(String s, int k) {

        int vowCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowCount++;
            }
        }

        int maxCount = vowCount;

        int startIndex = 0;
        int endIndex = k;

        while (endIndex < s.length()) {

            if (isVowel(s.charAt(startIndex))) {
                vowCount--;
            }
            startIndex++;

            if (isVowel(s.charAt(endIndex))) {
                vowCount++;
            }
            endIndex++;

            maxCount = Math.max(maxCount, vowCount);

        }

        return maxCount;
    }

    public static boolean isVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }

}

package com.patterns.slidingWindow;

import java.util.HashSet;
import java.util.Set;

// Leetcode 3
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> window = new HashSet<>();
        int first = 0;
        int second = 0;
        int maxTotal = 0;

        while (second < s.length()) {


            char current = s.charAt(second);

            while (window.contains(current)) {
                window.remove(s.charAt(first));
                first++;
            }

            window.add(current);
            second++;

            maxTotal = Math.max(maxTotal, window.size());

        }

        return maxTotal;
    }
}

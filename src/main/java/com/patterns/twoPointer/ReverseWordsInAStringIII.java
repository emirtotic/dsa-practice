package com.patterns.twoPointer;

// leetcode 557
public class ReverseWordsInAStringIII {

    public static void main(String[] args) {

        String s = "Let's take LeetCode contest";
        String expected = "s'teL ekat edoCteeL tsetnoc";

        String solution = solution(s);

        System.out.println("Solution correct? - " + solution.equals(expected));

    }

    public static String solution(String s) {

        String[] array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : array) {
            sb.append(reverse(word)).append(" ");
        }

        return sb.toString().trim();
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

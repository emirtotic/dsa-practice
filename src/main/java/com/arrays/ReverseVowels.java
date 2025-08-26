package com.arrays;

public class ReverseVowels {

    public static void main(String[] args) {
        String word = "hello";

        System.out.println(reverseOnlyVowels(word));
    }

    public static String reverseOnlyVowels(String s) {

        char[] array = s.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (left < right && !isVowel(array[left])) {
                left++;
            }

            while (left < right && !isVowel(array[right])) {
                right--;
            }

            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

        return new String(array);
    }

    public static boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }

    }


}

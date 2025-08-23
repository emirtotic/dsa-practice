package com.arrays;

public class ReverseString {

    public static void main(String[] args) {

        String word = "reversed";

        System.out.println(reverse2(word));


    }

    public static String reverse2(String word) {

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

    public static String reverse(String word) {

        char[] array = word.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = array.length - 1; i >= 0; i--) {

            result.append(array[i]);
        }

        return result.toString();
    }

}

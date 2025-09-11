package com.arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {

        String word = "a-bC-dEf-ghIj";
        System.out.println(solution(word));


    }

    private static String solution(String word) {

        char[] array = word.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            while (left < right && !Character.isLetter(array[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(array[right])) {
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

}
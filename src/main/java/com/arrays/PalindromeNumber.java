package com.arrays;

public class PalindromeNumber {

    public static void main(String[] args) {

        int number = 12121;

        System.out.println(number + " is palindrome: " + solution(number));

    }

    public static boolean solution(int number) {

        Integer num = number;
        char[] array = num.toString().toCharArray();

        int left = 0;
        int right = array.length - 1;


        while (left < right) {

            if (array[left] != array[right]) {
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

}

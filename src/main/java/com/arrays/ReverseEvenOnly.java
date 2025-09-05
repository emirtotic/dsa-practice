package com.arrays;

import java.util.Arrays;

public class ReverseEvenOnly {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6, 7};

        reverseEven(array);

        System.out.println(Arrays.toString(array));


    }


    public static int[] reverseEven(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {


            while (left < right && array[left] % 2 != 0) {
                left++;
            }

            while (left < right && array[right] % 2 != 0) {
                right--;
            }


            if (left < right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }

        return array;
    }

}

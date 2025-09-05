package com.arrays;

import java.util.Arrays;

public class ReverseIntArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        solution(array);

        System.out.println(Arrays.toString(array));

    }

    public static int[] solution(int[] array) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;

        }

        return array;
    }

}

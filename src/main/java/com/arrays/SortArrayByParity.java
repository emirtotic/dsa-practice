package com.arrays;

public class SortArrayByParity {
    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};

        solution(nums);


    }

    private static int[] solution(int[] array) {

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            if (array[left] % 2 == 0) {
                left++;
            } else if (array[right] % 2 != 0) {
                right--;
            } else {
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
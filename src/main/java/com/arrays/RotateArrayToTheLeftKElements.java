package com.arrays;

import java.util.Arrays;

public class RotateArrayToTheLeftKElements {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Arrays.stream(array).forEach(System.out::print);

        System.out.println("\nSOLUTION\n");

        rotate(array, k);
        Arrays.stream(array).forEach(System.out::print);


    }

    public static void rotate(int[] nums, int k) {

        if ( k == 0 ) {
            return;
        }

        k = k % nums.length;

        rotateArray1(0, nums.length - 1, nums);
        rotateArray1(0, k - 1, nums);
        rotateArray1(k, nums.length - 1, nums);

    }

    public static int[] rotateArray1(int start, int end, int[] nums) {

        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }

}

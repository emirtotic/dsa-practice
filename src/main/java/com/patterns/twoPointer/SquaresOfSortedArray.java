package com.patterns.twoPointer;

// Leetcode 977
public class SquaresOfSortedArray {

    public static void main(String[] args) {

        int[] array = {-100, -2, -1, 0, 3, 4};
        sortedSquares(array);

    }

    public static int[] sortedSquares(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        int head = 0;
        int tail = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[head] > nums[tail]) {
                result[i] = nums[head];
                head++;
            } else {
                result[i] = nums[tail];
                tail--;
            }

        }

        return result;
    }


}

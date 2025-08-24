package com.arrays;

/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class MozeZeros {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);

    }


    public static void moveZeros(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
        }
    }

    public static void print(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i] + " ]\n");
            } else {
                System.out.print(array[i] + " | ");
            }
        }
    }
}

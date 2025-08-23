package com.arrays;

/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class RemoveDuplicatesSorted {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicatesFromSortedArray(nums));

    }

    public static int removeDuplicatesFromSortedArray(int[] nums) {

        int index = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }

        }

        return index + 1;
    }

}

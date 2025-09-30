package com.patterns.twoPointer;

import java.util.Arrays;

//Leetcode 2441
public class LargestPositiveIntegerThatExistsWithItsNegative {

    public static void main(String[] args) {

        int[] nums = {-1, 10, 6, 7, -7, 1};

        System.out.println(findMaxK(nums));

    }

    public static int findMaxK(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int sum = nums[left] + nums[right];

            if (sum == 0) {
                return nums[right];
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }

        }

        return -1;
    }

}

package com.arrays;

//Leetcode 268
public class FindMissingNumber {

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {

        int result = (nums.length * (nums.length + 1)) / 2;

        for (int i : nums) {
            result -= i;
        }

        return result;
    }

}

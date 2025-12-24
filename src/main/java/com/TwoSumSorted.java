package com;

public class TwoSumSorted {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 12};
        int target = 10;

        twoSumSorted(nums, target);

        System.out.println();



    }

    public static int[] twoSumSorted(int[] nums, int target) {

        int[] result = new int[2];

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            }

            if (nums[left] + nums[right] == target) {
                result[0] = left;
                result[1] = right;
                break;
            }

        }

        return result;

    }





}
package com.patterns.slidingWindow;

// Leetcode 643
public class MaximumAverageSubarray {

    public static void main(String[] args) {


        int[] array = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(findMaxAverage(array, k));

    }


    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int startIndex = 0;
        int endIndex = k;
        int maxSum = sum;

        while (endIndex < nums.length) {

            sum -= nums[startIndex];
            startIndex++;

            sum += nums[endIndex];
            endIndex++;

            maxSum = Math.max(maxSum, sum);

        }

        return (double) maxSum / k;

    }

}

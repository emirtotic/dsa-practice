package com.patterns.twoPointer;

import java.util.List;

//Leetcode 2824
public class CountPairsWhoseSumIsLessThanTarget {

    public static void main(String[] args) {

        List<Integer> nums = List.of(-6, 2, 5, -2, -7, -1, 3);
        int target = -2;

        System.out.println(countPairs(nums, target));


    }

    public static int countPairs(List<Integer> nums, int target) {

        int counter = 0;

        Integer[] array = nums.toArray(new Integer[0]);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] + array[j] < target) {
                    counter++;
                }

            }

        }

        return counter;
    }

}

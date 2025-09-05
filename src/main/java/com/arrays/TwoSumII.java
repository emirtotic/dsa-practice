package com.arrays;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {

        int[] array = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution(array, target);

        System.out.println(Arrays.toString(result));

    }

    public static int[] solution(int[] array, int target) {
        int[] result = new int[2];

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int sum = array[left] + array[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
        }

        return result;
    }


}

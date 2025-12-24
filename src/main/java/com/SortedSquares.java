package com;

import java.util.HashSet;
import java.util.Set;

public class SortedSquares {


    public static void main(String[] args) {

        int[] array = {-4, -1, 0, 3, 10};

        solution(array);
    }

    public static int[] solution(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = i + 1; j < result.length; j++) {
                if (result[i] > result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;

    }


}
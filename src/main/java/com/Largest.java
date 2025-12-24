package com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Largest {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 18};

        System.out.println(solution(array));
    }

    public static int solution(int[] nums) {

        int sum = 0;
        int expectedSum = 0;

        for (int num : nums) {
            sum = sum + num;
        }

        for (int i = 1; i <= nums.length + 1; i++) {
            expectedSum = expectedSum + i;
        }


        return expectedSum - sum;
    }


}
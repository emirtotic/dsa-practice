package com;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        System.out.println(solution(nums1, target));

    }


    public static int solution(int[] numbers, int target) {

        if (numbers.length == 0) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {

            int middle = (left + right) / 2;
            int middleNum = numbers[middle];

            if (middleNum == target) {
                return middle;
            }

            if (target < middleNum) {
                right = middle - 1;
            }

            if (target > middleNum) {
                left = middle + 1;
            }

        }

        return -1;
    }
}
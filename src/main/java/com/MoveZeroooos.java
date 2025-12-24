package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class MoveZeroooos {
    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int target = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[target];
                nums[target] = nums[i];
                nums[i] = temp;
                target++;
            }
        }

    }







}
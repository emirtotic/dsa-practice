package com.prep;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(100, 100, 116, 105, 117, 121);

        System.out.println(isVow(input));

    }

    public static List<Object> isVow(List<Integer> a) {

        List<Object> result = new ArrayList<>();

        for (Integer i : a) {

            char temp = isVowel(i);

            if (temp != 'M') {
                result.add(temp);
            } else {
                result.add(i);
            }
        }
        return result;
    }

    public static char isVowel(int num) {

        HashMap<Integer, Character> map = new HashMap<>();

        map.put(97, 'a');
        map.put(101, 'e');
        map.put(105, 'i');
        map.put(111, 'o');
        map.put(117, 'u');

        if (map.containsKey(num)) {

           return map.get(num);

        } else {
            return 'M';
        }

    }










//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] result = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//
//        return result;
//
//    }


}

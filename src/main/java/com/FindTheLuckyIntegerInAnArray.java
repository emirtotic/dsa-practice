package com;

import java.util.HashMap;
import java.util.Map;

public class FindTheLuckyIntegerInAnArray {
    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 3, 2, 2};

        System.out.println(findLucky(nums));
    }

    public static int findLucky(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int max = -1;

        for (Map.Entry ent : map.entrySet()) {
            if (ent.getValue().equals(ent.getKey())) {
                if ((int )ent.getKey() > max) {
                    max = (int) ent.getKey();
                }
            }
        }


        return max;
    }



}
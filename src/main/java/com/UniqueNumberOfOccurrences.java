package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 1, 1, 3};

        System.out.println(solution(nums));
    }


    public static boolean solution(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int num : array) {

            if (map.containsKey(num)) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            } else {
                map.put(num, 1);
            }

        }

        for (Map.Entry<Integer, Integer> element : map.entrySet()) {
            set.add(element.getValue());
        }

        return set.size() == map.size();

    }

}

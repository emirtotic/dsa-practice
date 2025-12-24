package com;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static void main(String[] args) {

        String n = "mississippi";
        System.out.println(findChar(n));
    }

    public static char findChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        char result = ' ';

        for (Character c : s.toCharArray()) {

            if (map.containsKey(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> val : map.entrySet()) {
            if (val.getValue() > max) {
                max = val.getValue();
                result = val.getKey();
            }
        }

        return result;
    }








}
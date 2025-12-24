package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {

        String s = "leetcode";

        System.out.println(firstUniqueChar(s));



    }

    public static char firstUniqueChar(String s) {

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (Map.Entry<Character, Integer> c : map.entrySet()) {
            if (c.getValue() == 1) {
                return c.getKey();
            }
        }

        return ' ';
    }






}
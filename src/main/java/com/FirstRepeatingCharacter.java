package com;

import java.util.*;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {

        String s = "abca";
        System.out.println(firstRepeated(s));
    }

    public static char firstRepeated(String s) {

        HashSet<Character> set = new HashSet<>();

        for (Character c : s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        return ' ';
    }









}
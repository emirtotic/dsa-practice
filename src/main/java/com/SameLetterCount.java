package com;

import java.util.HashSet;
import java.util.Set;

public class SameLetterCount {


    public static void main(String[] args) {

        String s = "abc";
        String t = "xyz";

        System.out.println(sameLetterCount(s, t));
    }

    public static boolean sameLetterCount(String a, String b) {

        Set<Character> setS = new HashSet<>();
        Set<Character> setT = new HashSet<>();

        for (Character c : a.toCharArray()) {
            setS.add(c);
        }

        for (Character c : b.toCharArray()) {
            setT.add(c);
        }

        return setS.size() == setT.size();

    }


}
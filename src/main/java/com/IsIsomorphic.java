package com;

import java.util.HashMap;
import java.util.HashSet;

public class IsIsomorphic {
    public static void main(String[] args) {

        String s = "paper";
        String t = "title";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>(); // s -> t
        HashMap<Character, Character> mapTS = new HashMap<>(); // t -> s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Ako već postoji mapiranje c1 -> ?
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false; // puca konzistentnost
                }
            } else {
                mapST.put(c1, c2); // definišemo novo mapiranje
            }

            // Provera u drugom smeru (t -> s)
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) {
                    return false; // dva različita idu ka istom -> ne sme
                }
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }









}
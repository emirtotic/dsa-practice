package tuf.basicString;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(anagramStrings(s, t));


    }

    public static boolean anagramStrings(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();

        for (Character letter : s.toCharArray()) {

            mapS.put(letter, mapS.getOrDefault(letter, 0) + 1);

        }

        for (Character letter : t.toCharArray()) {

            mapS.put(letter, mapS.getOrDefault(letter, 0) - 1);

        }

        for (Map.Entry<Character, Integer> item : mapS.entrySet()) {
            if (item.getValue() != 0) {
                return false;
            }
        }

        return true;


    }

}

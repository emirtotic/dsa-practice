package com;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {

        String[] banned = {"hit"};
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        //String paragraph = "Bob";
        System.out.println(mostCommonWord(paragraph, banned));

    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> map = normalize(paragraph, banned);

        int max = 0;
        String result = "";

        for (Map.Entry<String, Integer> word : map.entrySet()) {

            if (word.getValue() > max) {
                max = word.getValue();
                result = word.getKey();
            }

        }
        return result;
    }


    public static HashMap<String, Integer> normalize(String paragraph, String[] banned) {

        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>();
        List<String> bannedWords = Arrays.stream(banned).toList();

        for (Character c : paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            } else {
                if (sb.length() > 0) {
                    String key = sb.toString().toLowerCase();
                    if (!bannedWords.contains(key)) {
                        map.put(key, map.getOrDefault(key, 0) + 1);
                    }
                    sb.setLength(0);
                }
            }
        }

        if (sb.length() > 0) {
            String key = sb.toString().toLowerCase();
            if (!bannedWords.contains(key)) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        return map;
    }


}
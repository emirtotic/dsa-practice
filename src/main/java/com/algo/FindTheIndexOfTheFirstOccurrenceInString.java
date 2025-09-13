package com.algo;

public class FindTheIndexOfTheFirstOccurrenceInString {

    public static void main(String[] args) {

        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println(solution(haystack, needle));

    }

    public static int solution(String haystack, String needle) {

        int result = -1;

        if (haystack.contains(needle)) {

            result = haystack.indexOf(needle);
        }

        return result;
    }

}

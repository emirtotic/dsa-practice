package com.arrays;

public class SplitTheLetters {

    public static void main(String[] args) {

        String word = "hello";
        String expectedResult = "hll eo";
        String mySolution = solution(word);

        System.out.println(word + " is modified and it is " + solution(word));

        System.out.println("Task passed: " + expectedResult.equalsIgnoreCase(mySolution));


    }

    public static String solution(String word) {


        StringBuilder samoglasnik = new StringBuilder();
        StringBuilder suglasnik = new StringBuilder();

        for (Character letter : word.toCharArray()) {

            if (isVowel(letter)) {
                samoglasnik.append(letter);
            } else {
                suglasnik.append(letter);
            }

        }

        return suglasnik.append(" ").append(samoglasnik).toString();
    }

    public static boolean isVowel(char a) {
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else {
            return false;
        }

    }

}

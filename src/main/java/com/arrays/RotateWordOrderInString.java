package com.arrays;

public class RotateWordOrderInString {

    public static void main(String[] args) {

        String sentence = "the sky is blue";
        String expected = "blue is sky the";

        String solution = solution(sentence);

        System.out.println(solution.equals(expected));


    }


    public static String solution(String sentence) {

        String[] array = sentence.split(" ");

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        StringBuilder sb = new StringBuilder();

        for(String s : array) {
            sb.append(s)
                    .append(" ");
        }

        return sb.toString().trim();

    }



}

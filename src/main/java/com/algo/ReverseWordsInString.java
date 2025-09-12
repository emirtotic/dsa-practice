package com.algo;

public class ReverseWordsInString {

    public static void main(String[] args) {

        String s = "Emir Totic 92";
        System.out.println(reverseEveryWordInAString(s));

    }

    public static String reverseEveryWordInAString(String sentence) {

        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(reverse(word)).append(" ");
        }

        sb.trimToSize();

        return sb.toString();

    }


    public static String reverse(String word) {

        char[] array = word.toCharArray();
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return new String(array);
    }

}

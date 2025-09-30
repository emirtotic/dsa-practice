package com.patterns.twoPointer;

//Leetcode 2000
public class ReversePrefixOfWord {

    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));


    }

    public static String reversePrefix(String word, char ch) {

        int index = 0;

        char[] array = word.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                index = i;
                break;
            }
        }

        int left = 0;
        int right = index;

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

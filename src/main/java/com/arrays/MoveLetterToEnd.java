package com.arrays;

/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class MoveLetterToEnd {

    public static void main(String[] args) {

        String word = "emiremiremir";
        char target = 'e';

        System.out.println(moveLetterToEnd(word, target));

    }

    public static String moveLetterToEnd(String word, char target) {

        char[] array = word.toCharArray();
        int index = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != target) {
                if (i != index) {
                    char temp = array[i];
                    array[i] = array[index];
                    array[index] = temp;
                    index++;
                }
            }
        }

        return new String(array);
    }

}

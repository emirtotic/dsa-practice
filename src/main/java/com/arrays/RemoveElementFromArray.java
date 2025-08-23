package com.arrays;

/**
 * Time complexity: O(n)
 * Space complexity: O(1)
 */
public class RemoveElementFromArray {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;

        int newArrayLength = removeElement(array, target);
        System.out.println(newArrayLength);

    }


    public static int removeElement(int[] array, int target) {
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                array[index] = array[i];
                index++;
            }
        }

        return index;
    }

}

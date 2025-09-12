package com.arrays.search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch(array, 31));

    }

    public static boolean binarySearch(int[] array, int target) {

        int min = 0;
        int max = array.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;
            if (target == array[mid]) {
                return true;
            } else if (target < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }

        }

        return false;


    }

}
package com.search;

public class FirstOccurrence {

    public static void main(String[] args) {

        int[] numbers = {5, 7, 7, 7, 8, 10};
        int target = 7;

        System.out.println(firstOccurrence(numbers, target));

    }

    public static int firstOccurrence(int[] numbers, int target) {

        if (numbers.length == 0) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;
        int minPosition = -1;

        while (left <= right) {

            int middle = (left + right) / 2;
            int middleNumber = numbers[middle];

            if (middleNumber == target) {
                minPosition = middle;
                right = middle - 1;
            } else if (middleNumber < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }

        return minPosition;

    }


}

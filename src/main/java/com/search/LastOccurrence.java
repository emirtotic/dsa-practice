package com.search;

public class LastOccurrence {

    public static void main(String[] args) {

        int[] numbers = {5, 7, 7, 7, 8, 10};
        int target = 7;

        System.out.println(lastOccurrence(numbers, target));

    }

    public static int lastOccurrence(int[] numbers, int target) {

        if (numbers.length == 0) {
            return -1;
        }

        int left = 0;
        int right = numbers.length - 1;
        int maxPosition = -1;

        while (left <= right) {

            int middle = (left + right) / 2;
            int middleNumber = numbers[middle];

            if (middleNumber == target) {
                maxPosition = middle;
                left = middle + 1;
            } else if (middleNumber < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }

        }

        return maxPosition;

    }


}

package com.arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 7, 1};
        sort(numbers);

    }

    public static int[] sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        return numbers;
    }



}

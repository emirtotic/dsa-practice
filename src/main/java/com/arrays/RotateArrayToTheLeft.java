package com.arrays;

import java.util.Arrays;

public class RotateArrayToTheLeft {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        Arrays.stream(array).forEach(System.out::print);

        System.out.println("\nSOLUTION\n");

        Arrays.stream(rotateArray(array)).forEach(System.out::print);

    }


    static int[] rotateArray(int[] numbers) {

        int[] rotated = new int[numbers.length];

        for (int i = 1; i < numbers.length; i++) {
            rotated[i - 1] = numbers[i];
        }

        rotated[rotated.length - 1] = numbers[0];

        return rotated;
    }

}

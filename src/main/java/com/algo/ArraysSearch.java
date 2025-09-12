package com.algo;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArraysSearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int target = 3;

        find(array, target).ifPresent(System.out::println);

    }

    public static OptionalInt find(int[] array, int target) {
        return Arrays.stream(array).filter(x -> x == target).findFirst();
    }



}

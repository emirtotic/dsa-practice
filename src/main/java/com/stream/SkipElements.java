package com.stream;

import java.util.Arrays;
import java.util.List;

public class SkipElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(7, 3, 5, 4, 1, 6);
        System.out.println("Numbers: " + numbers);

        List<Integer> skipped = numbers.stream()
                .skip(2)
                .toList();

        System.out.println("Skipped first 2 elements: " + skipped);

    }

}

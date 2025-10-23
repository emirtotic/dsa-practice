package com.stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapForNestedList {

    public static void main(String[] args) {

        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5)
        );

        List<Integer> flatList = nestedNumbers.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println("Nested list: " + nestedNumbers);
        System.out.println("Flat list: " + flatList);
        System.out.println("Explanation: flatMap converts each element into its own stream and then merges them into\n" +
                "a single stream.");

    }

}

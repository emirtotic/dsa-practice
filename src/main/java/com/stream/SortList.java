package com.stream;

import java.util.Arrays;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 2, 6, 8, 3, 5, 9, 0, 1);

        List<Integer> sorted = numbers.stream().sorted().toList();
        System.out.println(sorted);
    }

}

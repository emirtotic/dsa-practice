package com.stream;

import java.util.Arrays;
import java.util.List;

public class DistinctElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5);

        List<Integer> distinct = numbers.stream().distinct().toList();
        System.out.println(distinct);


    }

}

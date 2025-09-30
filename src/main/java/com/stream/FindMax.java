package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMax {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 2, 6, 8, 3, 5, 9, 0);

        int max = numbers.stream().max(Integer::compare).get();
        System.out.printf("max = %d\n", max);
    }

}

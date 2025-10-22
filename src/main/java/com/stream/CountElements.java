package com.stream;

import java.util.Arrays;
import java.util.List;

public class CountElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 2, 6, 8, 3, 5, 9, 0, 1);

        long count = numbers.stream().filter(num -> num > 5).count();
        System.out.println("Total numbers bigger than 5 is: " + count);
    }

}

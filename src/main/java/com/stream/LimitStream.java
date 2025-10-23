package com.stream;

import java.util.Arrays;
import java.util.List;

public class LimitStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(7, 3, 5, 4, 1, 6);
        System.out.println("Numbers: " + numbers);

        List<Integer> limited = numbers.stream()
                .limit(3)
                .toList();

        System.out.println("Limited on first 3: " + limited);

    }

}

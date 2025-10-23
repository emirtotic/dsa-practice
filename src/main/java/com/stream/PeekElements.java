package com.stream;

import java.util.Arrays;
import java.util.List;

public class PeekElements {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 4, 2, 6, 3);

        List<Integer> peekedAtNumbers = numbers.stream()
                .peek(System.out::println)
                .toList();

        System.out.println("Explanation: peek is used for debugging or performing actions without changing the stream.\n" +
                "It prints each element before passing it along the stream.");

    }

}

package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(18, 42, 55);

        Optional<Integer> firstElement = list.stream().findFirst();

        System.out.println("First element: " + firstElement.get());

    }

}

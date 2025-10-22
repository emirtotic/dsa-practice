package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAny {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 2, 6, 8, 3, 5, 9, 0);

        Optional<Integer> any = numbers.stream().findAny();
        System.out.printf("Found = %d\n", any.get());
        System.out.println("Explanation: findAny potentially returns any element from the stream, wrapped in an\n" +
                "Optional.");
    }

}

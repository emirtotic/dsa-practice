package com.stream;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

    public static void main(String[] args) {

        List<Integer> positive = Arrays.asList(2, 4, 6, 8);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        boolean allPositive = positive.stream().allMatch(num -> num % 2 == 0);
        System.out.println("All positive from the first list: " + allPositive);

        allPositive = numbers.stream().allMatch(num -> num % 2 == 0);
        System.out.println("All positive from the second list: " + allPositive);

    }

}

package com.stream;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(-2, -4, -5, 0);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        boolean result = list1.stream().noneMatch(num -> num > 1);
        System.out.println("No elements match the condition (larger than 1): " + result);

        result = list2.stream().noneMatch(num -> num > 1);
        System.out.println("No elements match the condition (larger than 1): " + result);

    }

}

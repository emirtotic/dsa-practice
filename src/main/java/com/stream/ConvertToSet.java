package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToSet {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 4, 4, 3, 5);
        System.out.println("List: " + list);

        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);

    }

}

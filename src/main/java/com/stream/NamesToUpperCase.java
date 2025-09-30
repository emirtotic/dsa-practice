package com.stream;

import java.util.ArrayList;
import java.util.List;

public class NamesToUpperCase {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sarah");
        names.add("Maria");

        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(uppercaseNames);

    }
}

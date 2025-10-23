package com.stream;

import java.util.Arrays;
import java.util.List;

public class ListFirstNames {

    public static void main(String[] args) {

        List<String> fullNames = Arrays.asList("Alice Johnson", "Bob Harris",
                "Charlie Lou");

        List<String> firstNames = fullNames.stream()
                .map(name -> name.split(" ")[0])
                .toList();

        List<String> lastNames = fullNames.stream()
                .map(name -> name.split(" ")[1])
                .toList();

        System.out.println("Full names: " + fullNames);
        System.out.println("First names: " + firstNames);
        System.out.println("Last names: " + lastNames);
        System.out.println("\nExplanation: The map function splits each name string and selects the first part.");

    }

}

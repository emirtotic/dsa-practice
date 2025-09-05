package com.random;
import java.util.*;

public class ReturnRepetitiveNumbers {

    public static void main(String[] args) {

        int[] array = {1, 3, 2, 4, 2, 1, 3, 7, 8};

        Set<Integer> numbers = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (Integer num: array) {

            if (!numbers.add(num)) {
                duplicates.add(num);
            }

        }

        System.out.println("Duplicates with solution from main: " + duplicates);
        System.out.println("Duplicates with map solution: ");
        System.out.println(solutionWithHashMap(array));

    }


    public static List<Integer> solutionWithHashMap(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for (Integer num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> val : map.entrySet()) {

            if (val.getValue() > 1) {
                duplicates.add(val.getKey());
            }

        }

        return duplicates;

    }


}




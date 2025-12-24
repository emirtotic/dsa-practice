package com.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummarizingStatistics {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Sum: " + stats.getSum());
        System.out.println("Count: " + stats.getCount());
    }

}

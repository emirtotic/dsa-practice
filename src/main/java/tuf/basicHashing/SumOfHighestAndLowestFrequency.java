package tuf.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class SumOfHighestAndLowestFrequency {

    public static void main(String[] args) {

        int[] nums = {100, 200, 200, 400, 400, 400, 400, 300, 300, 300};
        System.out.println(sumHighestAndLowestFrequency(nums));

    }

    public static int sumHighestAndLowestFrequency(int[] numbers) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], map.getOrDefault(numbers[i], 0) + 1);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> item : map.entrySet()) {

            if (item.getValue() > max) {
                max = item.getValue();
            }

            if (item.getValue() < min) {
                min = item.getValue();
            }

        }

        return min + max;

    }
}

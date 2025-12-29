package tuf.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFrequentElement {

    public static void main(String[] args) {

        int[] nums = {100, 200, 200, 400, 400, 400, 400, 300, 300, 300};
        System.out.println(secondMostFrequentElement(nums));

    }

    public static int secondMostFrequentElement(int[] nums) {

        if (nums == null || nums.length < 2) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;


        for (Map.Entry<Integer, Integer> item : map.entrySet()) {

            if (item.getValue() > second && item.getValue() < max) {
                second = item.getValue();
            }

            if (item.getValue() > max) {
                second = max;
                max = item.getValue();
            }


        }


        return second == Integer.MIN_VALUE ? -1 : second;

    }

}

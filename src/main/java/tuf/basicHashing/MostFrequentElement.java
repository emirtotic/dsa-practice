package tuf.basicHashing;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static void main(String[] args) {
        int[] array = {100, 200, 200, 300, 300};
        System.out.println(mostFrequentElement(array));
    }

    public static int mostFrequentElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && num < result)) {
                maxFreq = freq;
                result = num;
            }
        }

        return result;
    }

}

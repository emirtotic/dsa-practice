package tuf.basicArrays;

//LeetCode 485
public class MaximumConsecutiveOnes {

    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 0, 0, 0, 1, 1, 1, 0};

        System.out.println(findMaxConsecutiveOnes(nums));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int max = 0;

        for (int num : nums) {
            if (num == 1) {
                current++;
                max = Math.max(max, current);
            } else {
                current = 0;
            }
        }

        return max;
    }


}

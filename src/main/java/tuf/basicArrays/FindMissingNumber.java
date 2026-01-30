package tuf.basicArrays;

public class FindMissingNumber {

    public static void main(String[] args) {

        int[] nums = {0, 2, 3, 1, 4};
        System.out.println(missingNumber(nums));

    }

    public static int missingNumber(int[] nums) {

        int result = (nums.length * (nums.length + 1)) / 2;

        for (int i : nums) {
            result -= i;
        }

        return result;

    }

}

package tuf.basicArrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] array = {3, 3, 6, 1};
        System.out.println(largestElement(array));
    }

    public static int largestElement(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                max = nums[i];
            }

        }

        return max;

    }

}

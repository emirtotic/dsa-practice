package tuf.basicArrays;

public class SecondLargestElement {

    public static void main(String[] args) {

        int[] nums = {1, 7, 6, 2, 8, 3};
        //int[] nums = {8, 8, 7, 6, 5};
        System.out.println(secondLargestElement(nums));

    }

    public static int secondLargestElement(int[] nums) {

        if (nums == null || nums.length < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int num : nums) {
            if (num > max) {
                if (max != Integer.MIN_VALUE) {
                    foundSecond = true;
                }
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
                foundSecond = true;
            }
        }

        return foundSecond ? secondMax : -1;
    }


}

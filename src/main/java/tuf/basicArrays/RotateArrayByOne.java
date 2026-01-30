package tuf.basicArrays;

public class RotateArrayByOne {

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 6};

        rotateArrayByOne(nums);

    }

    public static void rotateArrayByOne(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            int temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;

        }

    }

}

package tuf.basicArrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] array = {0, 1, 4, 0, 5, 2};
        moveZeroes(array);

    }

    public static void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }

        }

    }

}

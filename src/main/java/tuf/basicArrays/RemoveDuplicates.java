package tuf.basicArrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] array = {0, 0, 3, 3, 5, 6};
        System.out.println(removeDuplicates(array));
    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[index]) {
                index++;
                nums[index] = nums[i];
            }

        }

        return index + 1;
    }
}

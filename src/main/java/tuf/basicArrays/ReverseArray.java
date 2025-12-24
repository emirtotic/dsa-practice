package tuf.basicArrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        reverse(array, array.length);
    }

    public static void reverse(int[] arr, int n) {

        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

}

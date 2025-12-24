package tuf.basicArrays;

public class CountOddsInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(countOdd(array, array.length));
    }

    public static int countOdd(int[] arr, int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 != 0) {
                count++;
            }

        }
        return count;

    }

}

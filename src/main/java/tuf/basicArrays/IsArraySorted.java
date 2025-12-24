package tuf.basicArrays;

public class IsArraySorted {

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array = {5, 5};
        System.out.println(arraySortedOrNot(array, array.length));
    }

    public static boolean arraySortedOrNot(int[] arr, int n) {

        if (n <= 1) {
            return true;
        }

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

}

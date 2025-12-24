package tuf;

public class CountAllDigits {

    public static void main(String[] args) {

        int num = 3242724;
        System.out.println(countDigit(num));
    }

    public static int countDigit(int num) {

        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

}

package tuf.basicString;

import java.util.Arrays;
import java.util.List;

public class PalindromeString {

    public static void main(String[] args) {

        String name = "anana";
        System.out.println(palindromeCheck(name));

    }

    public static boolean palindromeCheck(String s) {


        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }

        }

        return true;

    }

}

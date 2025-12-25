package tuf.basicString;

import java.util.Arrays;
import java.util.List;

public class ReverseString {

    public static void main(String[] args) {

        List<Character> list = Arrays.asList('a', 'b', 'c');

        reverseString(list);

    }

    public static void reverseString(List<Character> s) {

        int left = 0;
        int right = s.size() - 1;

        while (left < right) {
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            left++;
            right--;

        }

        System.out.println();


    }

}

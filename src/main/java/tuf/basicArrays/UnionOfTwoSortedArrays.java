package tuf.basicArrays;

import java.util.*;

public class UnionOfTwoSortedArrays {

    public static void main(String[] args) {

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};

        unionArray(nums1, nums2);


    }

    public static int[] unionArray(int[] nums1, int[] nums2) {

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            set.add(nums2[i]);
        }

        int[] result = new int[set.size()];
        int index = 0;

        for (Integer el : set) {
            result[index] = el;
            index++;
        }

        return result;
    }

}

package com;

import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }

        int[] result = new int[set2.size()];
        int counter = 0;

        for (Integer i : set2) {
            result[counter] = i;
            counter++;
        }

        return result;
    }


}
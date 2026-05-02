package com.github.rodiond26.multitrack.finals.p03_two_pointers;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        int pointer = m + n - 1;

        while (first >= 0 && second >= 0) {
            if (nums1[first] >= nums2[second]) {
                nums1[pointer] = nums1[first];
                first--;
            } else {
                nums1[pointer] = nums2[second];
                second--;
            }
            pointer--;
        }

        while (first >= 0) {
            nums1[pointer] = nums1[first];
            first--;
            pointer--;
        }

        while (second >= 0) {
            nums1[pointer] = nums2[second];
            second--;
            pointer--;
        }
    }
}

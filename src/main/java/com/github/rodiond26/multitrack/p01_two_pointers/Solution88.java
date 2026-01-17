package com.github.rodiond26.multitrack.p01_two_pointers;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = m - 1;
        int second = n - 1;
        int p = nums1.length - 1;

        while (first >= 0 && second >= 0) {
            if (nums1[first] > nums2[second]) {
                nums1[p] = nums1[first];
                first--;
            } else {
                nums1[p] = nums2[second];
                second--;
            }
            p--;
        }

        while (first >= 0) {
            nums1[p] = nums1[first];
            first--;
            p--;
        }

        while (second >= 0) {
            nums1[p] = nums2[second];
            second--;
            p--;
        }
    }
}

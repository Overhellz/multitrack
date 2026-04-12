package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> leftSumCount = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                leftSumCount.put(sum, leftSumCount.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int k = 0; k < nums3.length; k++) {
            for (int l = 0; l < nums4.length; l++) {
                int target = -(nums3[k] + nums4[l]);
                count += leftSumCount.getOrDefault(target, 0);
            }
        }
        return count;
    }

    public int fourSumCount2(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> leftSumCount = new HashMap<>();
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;
                leftSumCount.put(sum, leftSumCount.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int k : nums3) {
            for (int l : nums4) {
                count += leftSumCount.getOrDefault(-(k + l), 0);
            }
        }
        return count;
    }
}

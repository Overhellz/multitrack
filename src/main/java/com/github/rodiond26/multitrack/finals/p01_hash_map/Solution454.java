package com.github.rodiond26.multitrack.finals.p01_hash_map;

import java.util.HashMap;
import java.util.Map;

class Solution454 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> mapLeft = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sumLeft = nums1[i] + nums2[j];
                mapLeft.put(sumLeft, mapLeft.getOrDefault(sumLeft, 0) + 1);
            }
        }

        int count = 0;

        for (int k = 0; k < nums3.length; k++) {
            for (int l = 0; l < nums4.length; l++) {
                int sum = nums3[k] + nums4[l];
                count += mapLeft.getOrDefault(-sum, 0);
            }
        }

        return count;
    }
}

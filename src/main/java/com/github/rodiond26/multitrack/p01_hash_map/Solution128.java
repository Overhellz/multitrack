package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashSet;
import java.util.Set;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLen = 0;

        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int len = 1;

                while (set.contains(num + len)) {
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}

package com.github.rodiond26.multitrack.finals.p01_hash_map;

import java.util.HashSet;
import java.util.Set;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        for (Integer num : set) {
            if (set.contains(num - 1)) {
                continue;
            }

            int len = 1;
            while (set.contains(num + len)) {
                len++;
            }
            maxLength = Math.max(maxLength, len);
        }
        return maxLength;
    }
}

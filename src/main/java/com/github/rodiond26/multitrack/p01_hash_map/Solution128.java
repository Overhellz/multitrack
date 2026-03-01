package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashSet;
import java.util.Set;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int size = 0;
        int maxLength = 0;

        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;
                while (set.contains(current + 1)) {
                    current += 1;
                    length += 1;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}

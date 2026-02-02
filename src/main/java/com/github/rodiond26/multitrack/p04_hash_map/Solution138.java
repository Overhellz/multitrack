package com.github.rodiond26.multitrack.p04_hash_map;

import java.util.HashSet;
import java.util.Set;

class Solution138 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;
        for (Integer num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length += 1;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}

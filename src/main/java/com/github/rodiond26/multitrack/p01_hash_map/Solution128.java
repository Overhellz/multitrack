package com.github.rodiond26.multitrack.p01_hash_map;

import java.util.HashSet;
import java.util.Set;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLen = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int len = 1;
                while (numSet.contains(currentNum + len)) {
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}

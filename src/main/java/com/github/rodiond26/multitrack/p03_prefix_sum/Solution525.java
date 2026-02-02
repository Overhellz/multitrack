package com.github.rodiond26.multitrack.p03_prefix_sum;

import java.util.HashMap;
import java.util.Map;

class Solution525 {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum += 1;
            } else {
                sum -= 1;
            }

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                max = Math.max(max, length);
            } else {
                map.put(sum, i);
            }
        }

        return max;
    }
}

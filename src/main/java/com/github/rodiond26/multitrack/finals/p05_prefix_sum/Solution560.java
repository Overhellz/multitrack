package com.github.rodiond26.multitrack.finals.p05_prefix_sum;

import java.util.HashMap;
import java.util.Map;

class Solution560 {
    public int subarraySum(int[] nums, int k) {

        // sum to count
        Map<Integer, Integer> sum = new HashMap<>();
        sum.put(0, 1);

        int current = 0;
        int count = 0;
        for (int num : nums) {
            current += num;
            count += sum.getOrDefault(current - k, 0);
            sum.put(current, sum.getOrDefault(current, 0) + 1);
        }
        return count;
    }
}

package com.github.rodiond26.multitrack.finals.p05_prefix_sum;

import java.util.HashMap;
import java.util.Map;

class Solution974 {
    public int subarraysDivByK(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int remainder = sum % k;
            if (remainder < 0) {
                remainder +=k;
            }

            count += map.getOrDefault(remainder, 0);
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}

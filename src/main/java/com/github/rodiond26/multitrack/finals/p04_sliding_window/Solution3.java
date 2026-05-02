package com.github.rodiond26.multitrack.finals.p04_sliding_window;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            while (containsDuplicate(map)) {
                int leftCount = map.get(s.charAt(left));
                if (leftCount == 1) {
                    map.remove(s.charAt(left));
                } else {
                    map.put(s.charAt(left), leftCount - 1);
                }
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    private boolean containsDuplicate(Map<Character, Integer> map) {
        return map.values().stream().anyMatch(val -> val > 1);
    }
}

package com.github.rodiond26.multitrack.p02_sliding_window;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int max = 0;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hasOverOne(map)) {
                start++;
                pop(map, s.charAt(i));
            } else {
                max = Math.max(max, i - start + 1);
                push(map, s.charAt(i));
            }
        }

        return max;
    }

    private void push(Map<Character, Integer> map, char ch) {
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    private void pop(Map<Character, Integer> map, char ch) {
        map.put(ch, map.get(ch) - 1);
    }

    private boolean hasOverOne(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }
        return false;
    }
}

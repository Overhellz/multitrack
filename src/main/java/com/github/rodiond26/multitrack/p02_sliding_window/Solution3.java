package com.github.rodiond26.multitrack.p02_sliding_window;

import java.util.HashMap;
import java.util.Map;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> state = new HashMap<>();
        int max = 0;

        int begin = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            state.put(s.charAt(i), state.getOrDefault(s.charAt(i), 0) + 1);
            if (hasOnlyOneTime(state)) {

            }

        }


        return max;
    }

    private boolean hasOnlyOneTime(Map<Character, Integer> state) {
        for (Map.Entry<Character, Integer> entry : state.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }
}

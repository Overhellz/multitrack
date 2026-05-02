package com.github.rodiond26.multitrack.finals.p04_sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) {
            return List.of();
        }

        int[] target = toCharFrequencyArray(p);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String window = s.substring(i, i + p.length());
            int[] windowArray = toCharFrequencyArray(window);
            if (Arrays.equals(windowArray, target)) {
                result.add(i);
            }
        }
        return result;
    }

    int[] toCharFrequencyArray(String str) {
        int[] chars = new int[26];
        for (char ch : str.toCharArray()) {
            chars[ch - 'a']++;
        }
        return chars;
    }
}

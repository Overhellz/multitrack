package com.github.rodiond26.multitrack.p02_sliding_window;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// from 15:53 to 16:09 is 16 min
class Solution438 {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pHash = stringToCharFrequencyArray(p);
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String str = s.substring(i, i + p.length());
            int[] strHash = stringToCharFrequencyArray(str);

            if (Arrays.equals(pHash, strHash)) {
                result.add(i);
            }
        }

        return result;
    }

    public int[] stringToCharFrequencyArray(String str) {
        int[] freq = new int[26];

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        return freq;
    }
}

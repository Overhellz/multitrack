package com.github.rodiond26.multitrack.finals.p04_sliding_window;

import java.util.Arrays;

class Solution567 {
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int[] target = new int[26];
        int[] window = new int[26];

        for (char ch : s1.toCharArray()) {
            target[ch - 'a']++;
        }

        int len = s1.length();
        for (int i = 0; i < s2.length(); i++) {
            window[s2.charAt(i) - 'a']++;

            if (i >= len) {
                window[s2.charAt(i - len) - 'a']--;
            }

            if (Arrays.equals(target, window)) {
                return true;
            }
        }
        return false;
    }
}

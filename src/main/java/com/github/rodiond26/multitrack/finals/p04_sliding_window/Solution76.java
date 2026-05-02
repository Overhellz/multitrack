package com.github.rodiond26.multitrack.finals.p04_sliding_window;

import java.util.*;

class Solution76 {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }

        int[] target = toCharFrequencyArray(t);
        String result = null;
        int left = 0;
        int[] current = new int[128];

        for (int right = 0; right < s.length(); right++) {
            push(current, s.charAt(right));

            while (contains(current, target)) {
                if (result == null) {
                    result = s.substring(left, right + 1);
                } else {
                    if (s.substring(left, right + 1).length() < result.length()) {
                        result = s.substring(left, right + 1);
                    }
                }

                pop(current, s.charAt(left));
                left++;
            }
        }

        return result == null ? "" : result;
    }

    int[] toCharFrequencyArray(String str) {
        int[] arr = new int[128];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        return arr;
    }

    // arr.length == target.length
    private boolean contains(int[] arr, int[] target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target[i]) {
                return false;
            }
        }
        return true;
    }

    private void push(int[] arr, char ch) {
        arr[ch]++;
    }

    private void pop(int[] arr, char ch) {
        arr[ch]--;
    }
}

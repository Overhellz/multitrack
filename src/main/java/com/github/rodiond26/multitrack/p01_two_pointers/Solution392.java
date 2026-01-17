package com.github.rodiond26.multitrack.p01_two_pointers;

class Solution392 {
    public boolean isSubsequence(String s, String t) {

        if (s.isEmpty()) {
            return true;
        }

        int first = 0;

        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(first) == t.charAt(i)) {
                first += 1;
                if (first >= s.length()) {
                    return true;
                }
            }
        }

        return false;
    }
}
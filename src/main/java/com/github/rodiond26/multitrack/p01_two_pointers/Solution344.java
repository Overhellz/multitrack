package com.github.rodiond26.multitrack.p01_two_pointers;

class Solution344 {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }

        for (int i = 0; i < s.length / 2; i++) {
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}

class Solution344While {
    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }

        int left = 0;
        int right = s.length - 1;
        char tmp;

        while (left < right) {
            tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;

            left++;
            right--;
        }
    }
}

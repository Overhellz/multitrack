package com.github.rodiond26.multitrack.p03_two_pointers;

class Solution344 {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left <= right) {
            char t = s[left];
            s[left] = s[right];
            s[right] = t;

            left += 1;
            right -= 1;
        }
    }
}

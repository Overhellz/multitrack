package com.github.rodiond26.multitrack.p03_two_pointers;

class Solution125 {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right -= 1;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left += 1;
            right -= 1;
        }
        return true;
    }
}

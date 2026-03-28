package com.github.rodiond26.multitrack.p03_two_pointers;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                p++;
                nums[p] = nums[i];
            }
        }
        return p + 1;
    }
}

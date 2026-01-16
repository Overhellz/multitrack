package com.github.rodiond26.multitrack.p01_two_pointers;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int p = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[p] == nums[i]) {
                continue;
            }

            p++;
            nums[p] = nums[i];
        }
        return p + 1;
    }
}

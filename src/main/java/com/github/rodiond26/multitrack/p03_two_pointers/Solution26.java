package com.github.rodiond26.multitrack.p03_two_pointers;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if (nums[right] == nums[left]) {
                continue;
            }
            left++;
            nums[left] = nums[right];
        }
        return left + 1;
    }
}

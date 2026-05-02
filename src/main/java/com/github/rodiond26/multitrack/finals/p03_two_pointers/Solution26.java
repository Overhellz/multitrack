package com.github.rodiond26.multitrack.finals.p03_two_pointers;

class Solution26 {
    public int removeDuplicates(int[] nums) {
        int pointer = 0;

        /*
                            *
        [0,1,2,3,4,2,2,3,3,4]
                 *
         */

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[pointer]) {
                continue;
            }
            pointer++;
            nums[pointer] = nums[i];
        }
        return pointer + 1;
    }
}

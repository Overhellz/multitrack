package com.github.rodiond26.multitrack.p03_two_pointers;

class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;

        while (left <= right) {
            int l = nums[left] * nums[left];
            int r = nums[right] * nums[right];

            if (l >= r) {
                result[pos] = l;
                left++;
            } else {
                result[pos] = r;
                right--;
            }
            pos--;
        }
        return result;
    }
}

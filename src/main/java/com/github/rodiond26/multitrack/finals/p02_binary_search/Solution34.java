package com.github.rodiond26.multitrack.finals.p02_binary_search;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        int first = left;

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int second = right;

        if (first > second || first > nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, second};
    }
}

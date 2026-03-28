package com.github.rodiond26.multitrack.p03_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }

            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) {
                    continue;
                }

                int c = b + 1;
                int d = nums.length - 1;

                while (c < d) {
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum == target) {
                        result.add(List.of(nums[a], nums[b], nums[c], nums[d]));
                        c++;
                        d--;

                        while (c < d && nums[c] == nums[c - 1]) {
                            c++;
                        }
                        while (c < d && nums[d] == nums[d + 1]) {
                            d--;
                        }
                    } else if (sum < target) {
                        c++;
                    } else {
                        d--;
                    }
                }
            }
        }
        return result.stream().toList();
    }
}

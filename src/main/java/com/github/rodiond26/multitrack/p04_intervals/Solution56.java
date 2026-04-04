package com.github.rodiond26.multitrack.p04_intervals;

import java.util.*;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (arr1, arr2) -> arr1[0] - arr2[0]);
        List<int[]> result = new ArrayList<>();
        result.add(new int[]{intervals[0][0], intervals[0][1]});
        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.getLast();
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start <= last[1]) {
                if (end > last[1]) {
                    last[1] = end;
                }
            } else {
                result.add(intervals[i]);
            }
        }

        return result.toArray(new int[][]{});
    }
}

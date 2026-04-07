package com.github.rodiond26.multitrack.p04_intervals;

import java.util.Arrays;
import java.util.Comparator;

class Solution1288 {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, intervalComparator);

        int count = 0;
        int[] prev = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];

            if (prev[0] <= current[0] && current[1] <= prev[1]) {
                count++;
            } else {
                prev = current;
            }
        }

        return intervals.length - count;
    }

    private final Comparator<int[]> intervalComparator = (a, b) -> {
        if (a[0] == b[0]) {
            return Integer.compare(b[1], a[1]);
        }
        return Integer.compare(a[0], b[0]);
    };
}

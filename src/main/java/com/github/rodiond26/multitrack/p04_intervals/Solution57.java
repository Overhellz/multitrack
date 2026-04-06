package com.github.rodiond26.multitrack.p04_intervals;

import java.util.ArrayList;
import java.util.List;

class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int n = intervals.length;
        int start = newInterval[0];
        int end = newInterval[1];
        int i = 0;

        // before
        while (i < n && intervals[i][1] < start) {
            result.add(intervals[i]);
            i++;
        }

        // inside
        while (i < n && intervals[i][0] <= end) {
            start = Math.min(intervals[i][0], start);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        result.add(new int[]{start, end});

        // after
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[][]{});
    }
}

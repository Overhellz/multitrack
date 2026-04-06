package com.github.rodiond26.multitrack.p04_intervals;

import java.util.*;

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[1]));
        int count = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (start < lastEnd) {
                count++;
            } else {
                lastEnd = end;
            }
        }
        return count;
    }
}

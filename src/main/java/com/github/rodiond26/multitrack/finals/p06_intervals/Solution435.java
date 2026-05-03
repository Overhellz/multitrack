package com.github.rodiond26.multitrack.finals.p06_intervals;

import java.util.*;

class Solution435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0])); // TODO snippet

        int count = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            if (currentStart < lastEnd) {
                count++;
            } else {
                lastEnd = currentEnd;
            }
        }

        return count;
    }
}

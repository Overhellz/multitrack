package com.github.rodiond26.multitrack.finals.p06_intervals;

import java.util.ArrayList;
import java.util.List;

class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        int newStart = newInterval[0];
        int newEnd = newInterval[1];

        int i = 0;
        int n = intervals.length;

        // before
        while (i < n && intervals[i][1] < newStart) {
            list.add(intervals[i]);
            i++;
        }

        // inside
        while (i < n && intervals[i][0] <= newEnd) {
            newStart = Math.min(newStart, intervals[i][0]);
            newEnd = Math.max(newEnd, intervals[i][1]);
            i++;
        }
        list.add(new int[]{newStart, newEnd});

        // after
        while (i < n) {
            list.add(intervals[i]);
            i++;
        }

        return list.toArray(new int[][]{});
    }
}

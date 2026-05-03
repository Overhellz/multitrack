package com.github.rodiond26.multitrack.finals.p06_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0])); // TODO snippet

        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];
            int lastStart = list.getLast()[0];
            int lastEnd = list.getLast()[1];

            if (currentStart >= lastStart && currentStart <= lastEnd) {
                int newEnd = Math.max(currentEnd, lastEnd);
                list.getLast()[1] = newEnd;
            } else {
                list.add(intervals[i]);
            }
        }

        return list.toArray(new int[][]{}); // TODO snippet
    }
}

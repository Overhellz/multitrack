package com.github.rodiond26.multitrack.p04_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(arr -> arr[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.getLast();
            int lastEnd = last[1];

            int[] current = intervals[i];
            int currentStart = current[0];
            int currentEnd = current[1];

            if (currentStart <= lastEnd) {
                currentEnd = Math.max(currentEnd, lastEnd);
                last[1] = currentEnd;
            } else {
                result.add(current);
            }
        }

        return result.toArray(new int[][]{});
    }
}

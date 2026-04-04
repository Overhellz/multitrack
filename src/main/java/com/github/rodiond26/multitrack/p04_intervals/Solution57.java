package com.github.rodiond26.multitrack.p04_intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution57 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] arr = new int[intervals.length + 1][];

        for (int i = 0; i < intervals.length; i++) { // TODO: snippet
            arr[i] = intervals[i];
        }
        arr[arr.length - 1] = newInterval;
        Arrays.sort(arr, Comparator.comparingInt(array -> array[0])); // O(NlogN)

        List<int[]> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int[] last = result.getLast();
            int start = arr[i][0];
            int end = arr[i][1];

            if (start <= last[1]) {
                if (end > last[1]) {
                    last[1] = end;
                }
            } else {
                result.add(arr[i]);
            }
        }

        return result.toArray(new int[][]{});
    }
}

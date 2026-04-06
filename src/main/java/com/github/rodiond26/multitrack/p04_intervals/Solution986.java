package com.github.rodiond26.multitrack.p04_intervals;

import java.util.ArrayList;
import java.util.List;

class Solution986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int first = 0;
        int second = 0;

        List<int[]> result = new ArrayList<>();
        while (first < firstList.length && second < secondList.length) {
            int[] f = firstList[first];
            int[] s = secondList[second];

            int start = Math.max(f[0], s[0]);
            int end = Math.min(f[1], s[1]);

            if (start <= end) {
                result.add(new int[]{start, end});
            }

            if (f[1] < s[1]) {
                first++;
            } else {
                second++;
            }
        }

        return result.toArray(new int[ ][]{});
    }
}

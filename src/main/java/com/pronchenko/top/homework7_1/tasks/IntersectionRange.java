package com.pronchenko.top.homework7_1.tasks;

public class IntersectionRange {
    public static String IntersectionRange(int[] range) {//
        String allRanges = "";
        for (int i = 0; i < range.length; i = i + 2) {
            for (int j = i; j < range.length; j = j + 2) {
                String twoRanges = "";
                if ((range[j] >= range[i] && range[j] <= range[i + 1]) || (range[j + 1] > range[i] &&
                        range[j + 1] < range[i + 1] || range[i] >= range[j] && range[i] <= range[j + 1]) ||
                        (range[i + 1] > range[j] && range[i + 1] < range[j + 1])) {
                    if (i == j) {
                        continue;
                    }
                    twoRanges = String.format("пересекаются (%d,%d)(%d,%d)\n", range[i], range[i + 1], range[j], range[j + 1]);
                }
                allRanges = allRanges + twoRanges;
            }
        }
        return allRanges;
    }
}

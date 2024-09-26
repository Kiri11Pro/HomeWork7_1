package com.pronchenko.top.homework7_1.tasks;

public class Range1 {
    public void IntersectionRange(int[] range) {//
        for (int i = 0; i < range.length; i = i + 2) {
            for (int j = 0; j < range.length; j = j + 2) {
                if ((range[j] >= range[i] && range[j] <= range[i + 1]) || (range[j + 1] > range[i] && range[j + 1] < range[i + 1])) {
                    if (i == j) {
                        continue;
                    }
                    System.out.println("пересекаются" + "(" + range[i] + "," + range[i + 1] + ")" + "(" + range[j] + "," + range[j + 1] + ")");
                }
            }
        }
    }
}

package com.pronchenko.top.homework7_1.tasks;

public class RangeLenght  {
    public static int[] RangeLenght(int[]range) {
        int[] rangeLenght = new int[range.length / 2];
        for (int i = 0; i < range.length; i = i + 2) {
            rangeLenght[i / 2] = range[i + 1] - range[i];
        }
        return rangeLenght;
    }
}

package com.pronchenko.top.homework7_1;

import com.pronchenko.top.homework7_1.tasks.Range;

public class Main {
    public static void main(String[] args) {
        Range range = new Range();
        range.RangeLenght(5,3,5,-2,7,2,6,10,15,15,18);
        range.IntersectionRange(range.RangeLenght(5,3,5,-2,7,2,6,10,15,15,18));
    }
}

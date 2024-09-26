package com.pronchenko.top.homework7_1;

import com.pronchenko.top.homework7_1.tasks.Range;
import com.pronchenko.top.homework7_1.tasks.Range1;

public class Main {
    public static void main(String[] args) {
        Range range = new Range();
        Range1 range1 = new Range1();
        range.RangeLenght(5,3,5,-2,7,2,6,10,15,15,18);
        range1.IntersectionRange(range.RangeLenght(5,3,5,-2,7,2,6,10,15,15,18));
    }
}

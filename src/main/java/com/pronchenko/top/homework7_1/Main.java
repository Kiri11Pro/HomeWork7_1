package com.pronchenko.top.homework7_1;

import com.pronchenko.top.homework7_1.tasks.IntersectionRange;
import com.pronchenko.top.homework7_1.tasks.Range;
import com.pronchenko.top.homework7_1.tasks.RangeLenght;

import java.util.Arrays;
//import com.pronchenko.top.homework7_1.tasks.Range1;

public class Main {
    public static void main(String[] args) {


        System.out.println(Arrays.toString(Range.CreateRange(5,3,5,4,7,2,6,10,15,17,18)));
        System.out.println(Arrays.toString(RangeLenght.RangeLenght(Range.CreateRange(5,3,5,4,7,2,6,10,15,17,18))));
        System.out.println(IntersectionRange.IntersectionRange(Range.CreateRange(5,3,5,4,7,2,6,10,15,14,18)));
        
//        IntersectionRange(new IntersectionRange(Range.CreateRange(5,3,5,-2,7,2,6,10,15,17,18)));
//        IntersectionRange(Range.CreateRange(5,3,5,-2,7,2,6,10,15,17,18)));

//        Range1 range1 = new Range1();
//        range.RangeLenght(5,3,5,-2,7,2,6,10,15,15,18);
//        range1.IntersectionRange(range.RangeLenght(5,3,5,-2,7,2,6,10,15,15,18));
    }
}

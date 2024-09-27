package com.pronchenko.top.homework7_1.tasks;

import java.util.Arrays;

public class Range {
    private int[]range;
    public static int[] CreateRange(int n, int... range) {//создание и проверка диапазонов
        if (n != range.length / 2) {
            System.out.println("Диапазоны введены неверно");
        } else {
            for (int i = 0; i < range.length; i = i + 2) {//проверяю что начало диапазона меньше конца
                if (range[i] > range[i + 1]) {
                    System.out.println("Диапазоны введены неверно");
                    break;
                }
            }
        }
        return range;
    }

    public int[] getRange() {
        return range;
    }

    public void setRange(int[] range) {
        this.range = range;
    }
}
//    public static int[] RangeLenght(int n, int... range) {
//        int count = 0;
//        int[] rangeLenght = new int[n];//задаю массив из n диапазонов
//        if (n != range.length / 2) {// если количество введеных чисел не соответствует количеству диапазонов, то ошибка
//            System.out.println("Неверно введены диапазоны");
//        } else {
//            for (int i = 0; i < range.length; i = i + 2) {//проверяю что начало диапазона меньше конца
//                if (range[i] > range[i + 1]) {
//                    count++;//счетчик неверных диапазонов
//                    break;//если начало больше конца, прекращаю проверку
//                }
//                rangeLenght[i / 2] = range[i + 1] - range[i];
//            }
//            if (count > 0) {//после проверки всех диапазонов вывожу сообщение об ошибке
//                System.out.println("Неверно введены диапазоны");
//            } else /*System.out.println(Arrays.toString(range));*/
//            System.out.println(Arrays.toString(rangeLenght));
//        }
//        return range;
//    }
//    public void IntersectionRange(int[] range) {//
//        for (int i = 0; i < range.length; i = i + 2) {
//            for (int j = 0; j < range.length; j = j + 2) {
//                if ((range[j] >= range[i] && range[j] <= range[i + 1]) || (range[j + 1] > range[i] && range[j + 1] < range[i + 1])) {
//                    if (i == j) {
//                        continue;
//                    }
//                    System.out.println("пересекаются" + "(" + range[i] + "," + range[i + 1] + ")" + "(" + range[j] + "," + range[j + 1] + ")");
//                }
//            }
//        }
//    }
//}

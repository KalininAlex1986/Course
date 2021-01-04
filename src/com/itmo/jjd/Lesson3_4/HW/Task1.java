package com.itmo.jjd.Lesson3_4.HW;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    // Задача 1++
    // Заполните массив на N элементов случайными целыми числами
    // и выведите максимальное, минимальное и среднее значение.

    public static void main(String[] args) {
        int max = 0;
        int min = 1000;
        int average = 0;
        int [] array = new int [7];
        for (int i = 0; i < array.length; i++) {
            array [i] = ((int)(Math.random()*10)+1);

            average +=array[i];
            if (array[i]>max){max=array[i];};
            if (array[i]<min){min=array[i];};
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Среднее арифметическое = "+average/2);
        System.out.println("Максимальное значение массива = "+max);
        System.out.println("Минимальное значение массива = "+min);

    }
}
package com.itmo.jjd.Lesson3_4.HW;

import java.util.Arrays;

public class Task3 {
    //Задача 3
    //создать массив из 11 случайных чисел из отрезка [-1;1],
    //выведите массив в консоль
    //определите какой элемент встречается чаще всего и выведите информацию об этом в консоль
    //если два каких-либо элемента встречаюся одинаковое количество раз, то не выводить ничего

    public static void main(String[] args) {

        double[] myArray = new double[11]; // объявление и выделение памяти
        for (int i=0; i < myArray.length; i++) {
        myArray[i] =  Math.random(); // рандом целых чисел в диапазоне (0,x]
    }
        Arrays.sort(myArray);  // сортировка массива
        System.out. println (Arrays.toString(myArray));
}
}



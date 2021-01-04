package com.itmo.jjd.Lesson3_4.HW;

import java.util.Arrays;
//Создайте массив из четных чисел [2;20] и выведите элементы в консоль
//в обратном порядк [20 18 16]
public class Task2 {

    public static void main(String[] args) {
        int array [] = new int [10];
        for (int i = 0; i < array.length; i ++) {array[i]=i*2;};

        for (int i = array.length; i >=0 ; i--) {

            System.out.println(Arrays.toString(array));}
    }

}
package com.itmo.jjd.Lesson5.HW;

import java.util.Arrays;

//Найдите самое длинное слово в предложении, при условии, что в предложении все слова разной длины
//Например, в "в предложении все слова разной длины" самое длинное слово "предложении"
public class Task5 {
    public static void main(String[] args) {

        String s = new String("в предложении все слова разной длины");
        String str[] = s.split(" ");
        for (int i = 0; i < str.length; i++) {
        }
        System.out.println(Arrays.toString(str));
    }
}
package com.itmo.jjd.Lesson5.HW;

import java.util.Arrays;

//Найти количество вхождений одной строки в другую.
//Например, строка "дом" встречается в строке "дом домик домой одомашненный" 4 раза
public class Task2 {
    public static void main(String[] args) {
        String s = "дом домик домой одомашненный";
        String[]str = s.split(" ");
        String str1 = "дом";
        for (int i = 0; i< str.length ; i++) {
            s.contains(str1);
        }
        System.out.println(str.length);
    }

}

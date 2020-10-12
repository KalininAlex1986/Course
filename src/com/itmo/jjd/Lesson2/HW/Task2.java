package com.itmo.jjd.Lesson2.HW;

// Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….

public class Task2 {
    public static void main(String[] args) {

        int a = 2;
        for(int i = 1; i < 21; i++)
            System.out.print(  (int) Math.pow(a, i)+" ");
    }
}

package com.itmo.jjd.Lesson2.HW;

// Программа загадывает число в диапазоне [1;9]
// Пользователь вводит число с клавиатуры
// Программа в зависимости от введенного числа выводит в консоль следующее:
// "загаданное число больше"
// "загаданное число меньше"
// "Вы угадали" (программа завершает работу)
// если введен 0, выводит "выход из программы" (программа завершает работу)

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        double a = 1 + Math.random()*8;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int num = scanner.nextInt();
        while(num>=a )        {System.out.println("загаданное число больше");
            break;}
        while(num<=a )        {System.out.println("загаданное число меньше");
            break;}
        while(num==a )        {System.out.println("выход из программы");
        break;}
        while(num==0 )        {System.out.println("выход из программы");
            break;}
    }
}


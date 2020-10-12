package com.itmo.jjd.Lesson2.HW;

//Задача на синтаксис switch. Дана целочисленная переменная (номер билета от пользователя):
//если ее значение 111, 222 или 333 сообщить пользователю, что он получит "Книгу",
//если ее значение 444 или 555 сообщить пользователю, что он получит "Телефон",
// если ее значение 777 сообщить пользователю, что он получит "Ноутбук".
// В остальных случаях сообщить, что приза нет.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер билета");
        int ticketNumber = sc.nextInt();

        switch (ticketNumber) {
            case 111:
            case 222:
            case 333:
                System.out.println("Книга");
                break;
            case 444:
            case 555:
                System.out.println("Телефон");
                break;
            case 777:
                System.out.println("Ноутбук");
                break;
            default:
                System.out.println("Приза нет");
                break;
    }
    }
}

package com.itmo.jjd.Lesson2.HW;

// Пользователь! загадывает число в диапазоне от [1 до 100], программа пытается его угадать
// (используйте метод бинарного поиска - деление отрезка на 2).
// Программа может задавать пользователю вопросы:
// Число равно X? / Число больше X? / Число меньше X? и в зависимоти от ответа пользователя принимать решения.
// PS: вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА

import java.util.Scanner;

public class Task1 {


        public static void main(String[] args) {

            System.out.println("Загадайте число в диапазоне от [1 до 100] Я буду угадывать");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Число больше 50? Введите 0 если НЕТ или 1 если ДА");
            int answer = scanner.nextInt();
            int min = 1;
            int max  = 100;
            int mid  ;
            while ((min<=max)){
                if (answer==1){ mid = (max+min)/2;
                    System.out.println("Загаданное число больше"+mid);
                    min=mid;
                    answer=scanner.nextInt();


                } else if (answer==0){mid = (max-min)/2;
                    System.out.println("Загаданное число меньше"+mid);
                    max=mid;
                    answer=scanner.nextInt();

                }
            }
        }}

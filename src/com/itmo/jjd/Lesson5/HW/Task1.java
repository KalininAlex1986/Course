package com.itmo.jjd.Lesson5.HW;

import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

//Заполнить массив
//Задать массив на N слов.
//В цикле считывать с консоли слова (scanner.nextLine()), и добавлять их в массив (добавлять новое слово в массив можно только, если в нем его еще нет).
//В итоге в массиве будут только уникальные слова.
//Выход их программы по слову exit (его в массив не добавлять) или если массив заполнен
//Перед завершением программы, вывести получившийся массив в консоль
public class Task1 {
    public static void main(String[] args) {
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите слово , для выхода введите exit");
            String s = scanner.nextLine();
            if (s.equals("exit")){
                break;
            }
            else  str[i] = s;
        }
        System.out.println(Arrays.toString(str));
    }
}

package com.itmo.jjd.Lesson5.HW;

//Заменить все буквы в слове на строчные, а первую букву на заглавную
//Например, дано hello, получаем Hello / дано HeLLO, получаем Hello
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());

    }
}

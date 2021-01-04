package com.itmo.jjd.Lesson5.HW;

import java.util.Scanner;

public class Task3 {

     //Написать функцию, которая проверяет, является ли строка палиндромом.
     //Палиндром — это число, буквосочетание, слово или текст, которые одинаково читаются по буквам или по словам как слева направо, так и справа налево.
     //Например, 202 - палиндром / fafaf - палиндром / а роза упала на лапу Азора - палиндром
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите текст");
         String text = scanner.nextLine();
         text.replaceAll("\\W","")
          .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                             .reverse().toString());
         System.out.println(text);
     }
     }

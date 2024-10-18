package ru.mirea.lab14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите паттерн");
        String pattern = scanner.nextLine();
        System.out.println("Введите текст");
        String[] parts = scanner.nextLine().split(pattern);
    }
}

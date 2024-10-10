package ru.mirea.lab8;

import java.util.Scanner;

public class TesterTask2 {
    public static void recursion()
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num != 0)
        {
            if (num % 2 != 0) System.out.println(num);
            recursion();
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}

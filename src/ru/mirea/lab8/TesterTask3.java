package ru.mirea.lab8;
import java.util.Scanner;

public class TesterTask3 {
    public static void recursion()
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        if (num == 0) {
            return;
        }
        System.out.println(num);
        if (scanner.nextInt() != 0) {
            scanner.nextLine();
            recursion();
        }
    }

    public static void main(String[] args) {
        recursion();
    }
}

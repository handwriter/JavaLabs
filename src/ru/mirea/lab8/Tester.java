package ru.mirea.lab8;
import java.util.Scanner;

public class Tester {
    public static int recursion()
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        scanner.nextLine();
        if (num1 == 0)
        {
            int num2 = scanner.nextInt();
            scanner.nextLine();
            if (num2 == 0)
            {
                return 0;
            }
            return (num2 == 1 ? 1 : 0) + recursion();
        }
        else
        {
            if (num1 == 1)
            {
                return 1 + recursion();
            }
        }
        return recursion();
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}

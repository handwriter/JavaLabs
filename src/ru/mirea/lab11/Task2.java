package ru.mirea.lab11;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar userDate = Calendar.getInstance();
        System.out.println("Введите год");
        userDate.set(Calendar.YEAR, scanner.hasNextInt() ? scanner.nextInt() : 0);
        scanner.nextLine();
        System.out.println("Введите месяц");
        userDate.set(Calendar.MONTH, scanner.hasNextInt() ? scanner.nextInt() : 0);
        scanner.nextLine();
        System.out.println("Введите день");
        userDate.set(Calendar.DAY_OF_MONTH, scanner.hasNextInt() ? scanner.nextInt() : 0);
        scanner.nextLine();
        Calendar nowDate = Calendar.getInstance();
        if (nowDate.after(userDate))
        {
            System.out.println("Это в прошлом");
        }
        else
        {
            System.out.println("Это сейчас или в будущем");
        }
    }
}

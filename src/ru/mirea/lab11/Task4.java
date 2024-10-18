package ru.mirea.lab11;
import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calendar userDate = Calendar.getInstance();
        Date userDate1 = new Date();
        System.out.println("Введите год");
        userDate.set(Calendar.YEAR, scanner.hasNextInt() ? scanner.nextInt() : 0);
        userDate1.setYear(userDate.get(Calendar.YEAR) - 1900);
        scanner.nextLine();
        System.out.println("Введите месяц");
        userDate.set(Calendar.MONTH, scanner.hasNextInt() ? scanner.nextInt() : 0);
        userDate1.setMonth(userDate.get(Calendar.MONTH));
        scanner.nextLine();
        System.out.println("Введите день");
        userDate.set(Calendar.DAY_OF_MONTH, scanner.hasNextInt() ? scanner.nextInt() : 0);
        userDate1.setDate(userDate.get(Calendar.DAY_OF_MONTH));
        scanner.nextLine();
        System.out.println("Введите часы");
        userDate.set(Calendar.HOUR, scanner.hasNextInt() ? scanner.nextInt() : 0);
        userDate1.setHours(userDate.get(Calendar.HOUR));
        scanner.nextLine();
        System.out.println("Введите минуты");
        userDate.set(Calendar.MINUTE, scanner.hasNextInt() ? scanner.nextInt() : 0);
        userDate1.setMinutes(userDate.get(Calendar.MINUTE));
        scanner.nextLine();
    }
}

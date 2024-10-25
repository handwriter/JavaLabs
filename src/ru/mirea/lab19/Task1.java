package ru.mirea.lab19;
import java.util.Scanner;

public class Task1 {
    public static void checkNumber(String number) throws Exception {
        int counter = 0;
        for (int i = 0;i<number.trim().length();i++)
        {
            if (Character.isDigit(number.trim().charAt(i))) counter += 1;
        }
        if (counter != number.trim().length() || number.trim().length() != 12)
        {
            throw new Exception("Неверный формат ИНН");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            System.out.println("Введите ФИО:");
            String fio = scanner.nextLine();
            System.out.println("Введите ИНН:");
            String inn = scanner.nextLine();
            try {
                checkNumber(inn);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

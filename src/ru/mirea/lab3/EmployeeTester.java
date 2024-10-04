package ru.mirea.lab3;
import java.util.Scanner;


public class EmployeeTester {
    public static void generateReport(Employee[] employers)
    {
        for (int i = 0;i < employers.length;i++)
        {
            System.out.println(employers[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employersCount = 0;
        System.out.print("Количество сотрудников: ");
        if (scanner.hasNextInt())
        {
            employersCount = scanner.nextInt();
            scanner.nextLine();
        }
        Employee[] employers = new Employee[employersCount];
        for (int i = 0;i < employersCount;i++)
        {
            System.out.println("Имя: ");
            String fullname = scanner.hasNextLine() ? scanner.nextLine() : "";
            System.out.println("Зарплата: ");
            float salary = scanner.hasNextFloat() ? scanner.nextFloat() : 0;
            scanner.nextLine();
            if (!fullname.isEmpty())
            {
                employers[i] = new Employee(fullname, salary);
            }
        }
        generateReport(employers);
    }
}

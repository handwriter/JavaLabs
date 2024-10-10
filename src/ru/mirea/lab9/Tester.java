package ru.mirea.lab9;
import java.util.Scanner;
import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elemCount = scanner.nextInt();

        Student[] students = new Student[elemCount];
        for (int i = 0;i<elemCount;i++)
        {
            students[i] = new Student(scanner.nextInt());
        }
        for (int left = 0; left < students.length; left++) {
            Student value = students[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value.compareTo(students[i]) < 0) {
                    students[i + 1] = students[i];
                } else {
                    break;
                }
            }
            students[i + 1] = value;
        }
        System.out.println(Arrays.toString(students));
    }
}

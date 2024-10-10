package ru.mirea.lab9;

import java.util.Arrays;
import java.util.Scanner;

public class Tester3 {
    public static void mergeSort(Student[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        Student[] buffer = new Student[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || source[cursor].compareTo(source[delimiter]) > 0) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    public static Student[] mergeSort(Student[] source1, Student[] source2)
    {
        Student[] students = new Student[source1.length + source2.length];
        System.arraycopy(source1, 0, students, 0, source1.length);
        System.arraycopy(source2, 0, students, source1.length, source2.length);
        mergeSort(students, 0, students.length - 1);
        return students;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elemCount = scanner.nextInt();

        Student[] students1 = new Student[elemCount];
        for (int i = 0;i<elemCount;i++)
        {
            students1[i] = new Student(scanner.nextInt());
        }
        elemCount = scanner.nextInt();

        Student[] students2 = new Student[elemCount];
        for (int i = 0;i<elemCount;i++)
        {
            students2[i] = new Student(scanner.nextInt());
        }

        Student[] students = mergeSort(students1, students2);
        System.out.println(Arrays.toString(students));
    }
}

package ru.mirea.lab10;

import ru.mirea.lab9.Tester2;

import java.util.Comparator;
import java.util.Scanner;

public class Tester implements Comparator<Student2> {
    public static Student2[] iDNumber;

    public static final Tester instance=new Tester();

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o2.score - o1.score;
    }

    public static void quickSort(Student2[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student2 pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (instance.compare(source[leftMarker], pivot)<0) {
                leftMarker++;
            }
            while (instance.compare(source[rightMarker], pivot) > 0) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    Student2 tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public static void SetArray()
    {
        Scanner scanner = new Scanner(System.in);
        int elemCount = scanner.nextInt();

        iDNumber = new Student2[elemCount];
        for (int i = 0;i<elemCount;i++)
        {
            iDNumber[i] = new Student2(scanner.nextInt());
        }
    }
}

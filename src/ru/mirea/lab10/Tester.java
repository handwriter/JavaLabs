package ru.mirea.lab10;

import ru.mirea.lab9.Student;
import ru.mirea.lab9.Tester2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Tester implements Comparator<Student2> {
    public static Student2[] iDNumber;

    public static final Tester instance=new Tester();

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o2.score - o1.score;
    }

    public static void quickSort(Student2[] source, int leftBorder, int rightBorder, Comparator<Student2> compareType) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student2 pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (compareType.compare(source[leftMarker], pivot)<0) {
                leftMarker++;
            }
            while (compareType.compare(source[rightMarker], pivot) > 0) {
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
            quickSort(source, leftMarker, rightBorder, compareType);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker, compareType);
        }
    }

    public static void mergeSort(Student2[] source, int left, int right, Comparator<Student2> compareType) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1, compareType);
            mergeSort(source, delimiter, right, compareType);
        }
        Student2[] buffer = new Student2[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || compareType.compare(source[cursor], source[delimiter]) > 0) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    public static void setArray()
    {
        Scanner scanner = new Scanner(System.in);
        int elemCount = scanner.nextInt();

        iDNumber = new Student2[elemCount];
        for (int i = 0;i<elemCount;i++)
        {
            iDNumber[i] = new Student2(scanner.nextInt(), scanner.nextInt());
        }
    }

    public void outArray()
    {
        System.out.println(Arrays.toString(iDNumber));
    }
}

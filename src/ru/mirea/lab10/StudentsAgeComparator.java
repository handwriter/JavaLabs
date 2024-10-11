package ru.mirea.lab10;

import java.util.Comparator;

public class StudentsAgeComparator implements Comparator<Student2> {
    public static final StudentsAgeComparator instance = new StudentsAgeComparator();
    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o2.age - o1.age;
    }
}

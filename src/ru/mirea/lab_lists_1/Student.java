package ru.mirea.lab_lists_1;

import java.io.Console;
import java.util.Scanner;

public class Student {
    private String name;
    private Integer age;
    public Student next = null;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setNext(Student student) {
        if (next == null) {
            next = student;
        } else {
            next.setNext(student);
        }
    }

    public static Student readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя студента:");
        String newName = scanner.nextLine();
        Integer newAge = scanner.nextInt();
        if (!newName.isEmpty()) {
            return new Student(newName, newAge);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package ru.mirea.lab_lists_1;

import java.util.Scanner;

public class Student2 {
    private String name;
    private Integer age;
    public Student2 next = null;
    public Student2 prev = null;

    public Student2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setNext(Student2 student) {
        if (next == null) {
            next = student;
        } else {
            next.setNext(student);
        }
    }

    public void setPrev(Student2 student) {
        if (prev == null) {
            prev = student;
        } else {
            prev.setPrev(student);
        }
    }



    public static Student2 readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя студента:");
        String newName = scanner.nextLine();
        Integer newAge = scanner.nextInt();
        if (!newName.isEmpty()) {
            return new Student2(newName, newAge);
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

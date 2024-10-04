package ru.mirea.lab4_1;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5, 5, 2),
                new Rectangle(0, 0, 20, 10),
                new Square(2, 5, 2)
        };
        System.out.println(Arrays.toString(shapes));
    }
}

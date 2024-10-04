package ru.mirea.lab3;
import java.util.Arrays;
import java.util.Random;

// Task 1

public class MathAndRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        double[] values = new double[10];
        for (int i = 0;i<10;i++)
        {
            values[i] = rand.nextDouble();
        }
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
        for (int i = 0;i < 10;i++)
        {
            values[i] = Math.random();
        }
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println(Arrays.toString(values));
    }
}

package ru.mirea.lab1;
import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        if (sc.hasNextInt())
        {
            counter = sc.nextInt();
        }
        int[] dataNums = new int[counter];
        int summary = 0;
        for (int i = 0;i < counter;i++)
        {
            if (sc.hasNextInt()) dataNums[i] = sc.nextInt();
            summary += dataNums[i];
        }
        System.out.println(String.format("Summary: %d; Average: %f", summary, (float)summary / counter));
    }
}

package ru.mirea.lab1;
import java.util.Arrays;
import java.util.Scanner;

public class Example {
    // First task
    public static void main1(String[] args) {
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

    // Second task
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        if (sc.hasNextInt())
        {
            counter = sc.nextInt();
        }
        int[] dataNums = new int[counter];
        int summary = 0;
        int index = 0;
        int minElem = 0;
        int maxElem = 0;
        while (index < counter)
        {
            dataNums[index] = sc.nextInt();
            summary += dataNums[index];
            if (index == 0)
            {
                minElem = dataNums[index];
                maxElem = dataNums[index];
            }
            else
            {
                minElem = Math.min(minElem, dataNums[index]);
                maxElem = Math.max(maxElem, dataNums[index]);
            }
            index++;
        }
        System.out.println(String.format("Summary: %d; Min: %d; Max: %d", summary, minElem, maxElem));
    }

    //Third task
    public static void main(String[] args)
    {
        for (int i = 0;i < args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}

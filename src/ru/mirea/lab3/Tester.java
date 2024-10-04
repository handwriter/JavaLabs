package ru.mirea.lab3;
import java.util.Scanner;
import java.util.Arrays;

//Task 2
public class Tester {
    public static Circle[] circles;
    public static int circlesLength;

    public static void SortCircles()
    {
        for (int i = 0;i < circlesLength;i++)
        {
            for (int j = i + 1;j < circlesLength;j++)
            {
                if (circles[i].GetSquare() > circles[j].GetSquare())
                {
                    Circle temp = circles[i];
                    circles[i] = circles[j];
                    circles[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        circles = new Circle[10];
        for (int i = 0;i<10;i++)
        {
            circles[i] = new Circle(Math.random()*10, Math.random()*10, Math.random()*10);
        }
        circlesLength = circles.length;
        System.out.println(Arrays.toString(circles));
        SortCircles();
        System.out.println(Arrays.toString(circles));
    }

    public static void main22(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество окружностей: ");
        if (scanner.hasNextInt())
        {
            circles = new Circle[scanner.nextInt()];
            scanner.nextLine();
            for (int i = 0;i<circles.length;i++)
            {
                float x = -1;
                System.out.print("Введите X: ");
                while (x == -1)
                {
                    x = scanner.hasNextFloat() ? scanner.nextFloat() : -1;
                }
                scanner.nextLine();
                float y = -1;
                System.out.print("Введите Y: ");
                while (y == -1)
                {
                    y = scanner.hasNextFloat() ? scanner.nextFloat() : -1;
                }
                scanner.nextLine();
                float r = -1;
                System.out.print("Введите R: ");
                while (r == -1)
                {
                    r = scanner.hasNextFloat() ? scanner.nextFloat() : -1;
                }
                scanner.nextLine();

                circles[i] = new Circle(x, y, r);
            }
            circlesLength = circles.length;
            System.out.println(Arrays.toString(circles));
            SortCircles();
            System.out.println(Arrays.toString(circles));
        }

    }


}

package ru.mirea.lab26;

import java.io.Console;
import java.util.Stack;

public class Task1 {
    public static void main(String[] args) {
        Stack<Integer> data = new Stack<Integer>();

        for (int i = 0;i < 10;i++)
        {
            data.push(i);
        }
        System.out.println(data);
        Stack<Integer> dataTmp = new Stack<Integer>();
        for (int i = 0;i < 10;i++)
        {
            dataTmp.push(data.pop());
        }
        data = dataTmp;
        System.out.println(data);
    }
}

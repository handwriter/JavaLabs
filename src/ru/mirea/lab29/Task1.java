package ru.mirea.lab29;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int res = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res += con.nextInt();
            }
        }
        res /= 2;
        System.out.println(res);
        con.close();
    }
}

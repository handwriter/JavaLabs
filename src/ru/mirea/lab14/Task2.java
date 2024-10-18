package ru.mirea.lab14;
import java.util.regex.*;

public class Task2 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        System.out.println(p1.matcher("abcdefghijklmnopqrstuv18340").find());
        System.out.println(p1.matcher("abcdefghijklmnoasdfasdpqrstuv18340").find());
    }
}

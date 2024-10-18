package ru.mirea.lab14;
import java.util.regex.*;
public class Task4 {
    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("\\d+\\s*\\+");
        System.out.println(p1.matcher("(1+8)–9/4").find());
        System.out.println(p1.matcher("6/5–2*9").find());
    }
}

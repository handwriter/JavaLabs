package ru.mirea.lab_25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9_]{8,}$");
        String password = "example8932MASS";
        Matcher matcher = pattern.matcher(password);
        System.out.println(matcher.find());
    }
}

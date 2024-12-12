package ru.mirea.lab_25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^(?!\\.|.*\\.\\.)[a-zA-Z0-9.]+(?!\\.)@[a-zA-Z0-9.]+\\.?[a-zA-Z]+$");
        String email = "example@example.com";
        Matcher matcher = pattern.matcher(email);
        System.out.println(matcher.find());
    }
}

package ru.mirea.lab_25;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String txt = "Ценники: 99 USD,\n999 RUB,\n449 ERR,\n24 EU,\n150 EUR,\n223 RUB";
        Pattern pattern = Pattern.compile("(\\d+(\\.\\d{1,4})?) (USD|EUR|RUB)");
        Matcher matcher = pattern.matcher(txt);
        System.out.println(matcher.group());
        while (matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
}

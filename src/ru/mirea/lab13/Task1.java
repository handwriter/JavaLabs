package ru.mirea.lab13;

public class Task1 {
    private static void processStr(String str)
    {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println("I like Java!!!".indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        if (str.contains("Java")) System.out.println(str.substring(0, str.indexOf("Java")) +
                str.substring(str.indexOf("Java")+4, str.length()));
    }

    public static void main(String[] args) {
        processStr("I like Java!!!");
    }
}

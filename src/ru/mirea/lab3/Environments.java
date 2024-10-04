package ru.mirea.lab3;

public class Environments {
    public static void main(String[] args) {
        Double a1 = Double.valueOf(0.2112);
        Double a2 = Double.valueOf(6.1);
        double b1 = Double.parseDouble("0.3");
        byte m1 = a1.byteValue();
        short m2 = a1.shortValue();
        int m3 = a1.intValue();
        long m4 = a1.longValue();
        float m5 = a1.floatValue();
        System.out.print(a2);
        String d = Double.toString(b1);
    }
}

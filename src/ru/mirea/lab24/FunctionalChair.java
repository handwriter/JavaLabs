package ru.mirea.lab24;

public class FunctionalChair implements Chair {
    @Override
    public String GetType() {
        return "Functional Chair";
    }

    public int sum(int a, int b)
    {
        return a + b;
    }
}

package ru.mirea.lab24;

public class VictorianChair implements Chair{
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public String GetType() {
        return "Victorial Chair";
    }

    public int getAge() {
        return age;
    }
}

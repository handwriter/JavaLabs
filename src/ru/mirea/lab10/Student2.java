package ru.mirea.lab10;

public class Student2 {
    public int score;
    public int age;

    public Student2(int score)
    {
        this.score = score;
    }

    public Student2(int score, int age)
    {
        this.score = score;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "score=" + score +
                '}';
    }
}

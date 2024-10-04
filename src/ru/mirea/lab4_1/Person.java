package ru.mirea.lab4_1;

public class Person {
    private String fullName;
    private int age;

    public String getFullName()
    {
        return fullName;
    }

    public void setFullName(String fullName)
    {
        this.fullName = fullName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void move()
    {
        System.out.println(fullName + " двигается");
    }

    public void talk()
    {
        System.out.println(fullName + " говорит");
    }

    public Person()
    {
    }

    public Person(String fullName, int age)
    {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person pers1 = new Person();
        Person pers2 = new Person("Name", 28);
    }
}

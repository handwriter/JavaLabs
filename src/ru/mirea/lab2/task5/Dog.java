package ru.mirea.lab2.task5;

public class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog (String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int ageAsHuman()
    {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog{ Name='"+name+"', age="+age+", humanAge="+ageAsHuman()+"}";
    }
}

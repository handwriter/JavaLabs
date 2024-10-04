package ru.mirea.lab3;

public class Employee {
    private String fullname;
    private float salary;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Employee(String fullname, float salary)
    {
        this.fullname = fullname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Fullname: " + fullname + "\nSalary: " + String.format("%10.4s", salary) + "\n";
    }
}

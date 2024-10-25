package ru.mirea.lab19;

public class Student implements Comparable<Student> {
    public int idNumber;
    public String fullName;

    @Override
    public int compareTo(Student o) {
        return idNumber - o.idNumber;
    }

    public Student(int idNumber, String fullName)
    {
        this.idNumber = idNumber;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

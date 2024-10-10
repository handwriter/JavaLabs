package ru.mirea.lab9;

public class Student implements Comparable<Student> {
    public int idNumber;

    @Override
    public int compareTo(Student o) {
        return idNumber - o.idNumber;
    }

    public Student(int idNumber)
    {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                '}';
    }
}

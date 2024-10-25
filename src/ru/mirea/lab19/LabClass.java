package ru.mirea.lab19;

import java.util.ArrayList;

public class LabClass {
    public ArrayList<Comparable> students = new ArrayList<>();

    public void SetDefaultData()
    {
        students.add(new Student(4, "Макаров А.П."));
        students.add(new Student(5, "Ершов М.В."));
        students.add(new Student(0, "Серов М.Ю."));
        students.add(new Student(10, "Дрозд М.В."));
        students.add(new Student(6, "Станов В.А."));
    }

    public LabClass()
    {
        SetDefaultData();
    }

    public Student findByName(String fullName) throws EmptyStringExeption, StudentNotFoundExeption {
        if (fullName.trim().isEmpty()) throw new EmptyStringExeption("Пустое поисковое значение");
        for (int i = 0;i<students.size();i++)
        {
            if (((Student) students.get(i)).fullName.equals(fullName.trim()))
            {
                return (Student) students.get(i);
            }
        }
        throw new StudentNotFoundExeption("Student not found");
    }
}

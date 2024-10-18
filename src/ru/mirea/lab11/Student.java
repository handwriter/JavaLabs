package ru.mirea.lab11;

import java.util.Calendar;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private String course;
    private String group;
    private Calendar birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student(String name, String surname, String speciality, String course, String group, Calendar birthDate)
    {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.birthDate = birthDate;
    }

    public Calendar getBirthDate() {
        return birthDate;
    }

    // s - short, m - middle, f - full
    public String getBirthDateStr(String format)
    {
        switch (format)
        {
            case "m":
            case "s":
                return birthDate.get(Calendar.DAY_OF_MONTH) + "." + birthDate.get(Calendar.MONTH) + "." + birthDate.get(Calendar.YEAR) +
                        " " + (format == "m" ? (birthDate.get(Calendar.HOUR) + ":" + birthDate.get(Calendar.MINUTE)) : "");
            case "f":
                return birthDate.toString();
        }
        return "";
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }
}

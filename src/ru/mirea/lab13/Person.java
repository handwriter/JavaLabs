package ru.mirea.lab13;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getName() {
        StringBuilder result = new StringBuilder();
        if (lastName != null && !lastName.isEmpty()) result.append(lastName);
        if (firstName != null && !firstName.isEmpty()) result.append(" ").append(firstName.charAt(0)).append(".");
        if (middleName != null && !middleName.isEmpty()) result.append(middleName.charAt(0)).append(".");
        return result.toString();
    }
}
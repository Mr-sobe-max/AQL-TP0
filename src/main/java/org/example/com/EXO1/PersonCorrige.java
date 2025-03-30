package org.example.com.EXO1;

public class PersonCorrige {
    private String firstName;
    private String lastName;
    private int age;

    public PersonCorrige(String firstName, String lastName, int age) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name must not be null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be non-negative");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}

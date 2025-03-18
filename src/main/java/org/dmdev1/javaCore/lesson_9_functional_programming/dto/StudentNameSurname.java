package org.dmdev1.javaCore.lesson_9_functional_programming.dto;

public class StudentNameSurname {
    private String name;
    private String surname;

    public StudentNameSurname(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}

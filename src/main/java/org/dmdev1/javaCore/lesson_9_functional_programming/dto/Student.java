package org.dmdev1.javaCore.lesson_9_functional_programming.dto;

import java.util.List;

public class Student {

    private String name;
    private String surname;
    private Integer courseNumber;
    private List<Integer> marks;

    public Student() {
    }

    public Student(String name, String surname, Integer courseNumber, List<Integer> marks) {
        this.name = name;
        this.surname = surname;
        this.courseNumber = courseNumber;
        this.marks = marks;
    }

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

    public Integer getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(Integer courseNumber) {
        this.courseNumber = courseNumber;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", courseNumber=" + courseNumber +
                ", marks=" + marks +
                '}';
    }
}

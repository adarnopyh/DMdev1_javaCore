package org.dmdev1.javaCore.lesson_9_functional_programming.dto;

import java.util.List;

public class CourseSummary {
    private List<StudentNameSurname> sortedStudents;
    private double averageMarks;

    public CourseSummary(List<StudentNameSurname> sortedStudents, double averageMarks) {
        this.sortedStudents = sortedStudents;
        this.averageMarks = averageMarks;
    }

    public List<StudentNameSurname> getSortedStudents() {
        return sortedStudents;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    @Override
    public String toString() {
        return "Sorted Students: " + sortedStudents + ", Average Marks: " + String.format("%.2f", averageMarks);
    }
}

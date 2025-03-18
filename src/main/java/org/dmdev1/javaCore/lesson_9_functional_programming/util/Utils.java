package org.dmdev1.javaCore.lesson_9_functional_programming.util;

import org.dmdev1.javaCore.lesson_9_functional_programming.dto.CourseSummary;
import org.dmdev1.javaCore.lesson_9_functional_programming.dto.Student;
import org.dmdev1.javaCore.lesson_9_functional_programming.dto.StudentNameSurname;

import java.util.List;
import java.util.Map;

public final class Utils {
    private Utils() {
    }

    public static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void printMapTask1(Map<Integer, Double> task1Result) {
        task1Result.forEach((course, avgMark) ->
                System.out.println("Course " + course + " -> average mark: " + roundDoubleFrom0To3(avgMark, 2)));

    }

    public static void printMapTask2(Map<Integer, List<StudentNameSurname>> task2Result) {
        task2Result.forEach((course, studentList) ->
                System.out.println("Course " + course + " : " + studentList));

    }

    public static void printMapTask3(Map<Integer, CourseSummary> task3Result) {
        task3Result.forEach((course, summary) ->
                System.out.println("Course " + course + " : " + summary));

    }

    private static double roundDoubleFrom0To3(double value, int places) {
        if (places < 0 || places > 3) {
            throw new IllegalArgumentException();
        }

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}

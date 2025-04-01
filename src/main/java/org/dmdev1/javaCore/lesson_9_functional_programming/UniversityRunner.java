package org.dmdev1.javaCore.lesson_9_functional_programming;

import org.dmdev1.javaCore.lesson_9_functional_programming.dto.Student;
import org.dmdev1.javaCore.lesson_9_functional_programming.util.JsonReader;

import java.util.List;

import static org.dmdev1.javaCore.lesson_9_functional_programming.util.Task1Util.task1;
import static org.dmdev1.javaCore.lesson_9_functional_programming.util.Task2Util.task2;
import static org.dmdev1.javaCore.lesson_9_functional_programming.util.Task3Util.task3;
import static org.dmdev1.javaCore.lesson_9_functional_programming.util.Utils.*;

public class UniversityRunner {
    public static void main(String[] args) {
        List<Student> students = JsonReader.readStudentsFromJson("students.json");
        printList(students);
        System.out.println("\nTask 1:");
        printMapTask1(task1(students));
        System.out.println("\nTask 2:");
        printMapTask2(task2(students));
        System.out.println("\nTask 3:");
        printMapTask3(task3(students));

    }
}

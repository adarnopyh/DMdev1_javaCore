package org.dmdev1.javaCore.lesson_9_functional_programming.util;

import org.dmdev1.javaCore.lesson_9_functional_programming.dto.CourseSummary;
import org.dmdev1.javaCore.lesson_9_functional_programming.dto.Student;
import org.dmdev1.javaCore.lesson_9_functional_programming.dto.StudentNameSurname;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
* Задание 1

Дан список студентов с полями:
- Имя
- Фамилия
- Номер курса в университете
- Список оценок за учебу

Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:

1 - Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

2 - Список студентов данного курса, но только с полями Имя и Фамилия.
    Список должен быть отсортированы по этим двум полям

3 - Объект с двумя полями:
        - Отсортированный список студентов с пункта 2
        - Средняя оценка этих студентов

Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap*/

public final class Task3Util {
    private Task3Util() {
    }


    public static Map<Integer, CourseSummary> task3(List<Student> students) {
        Map<Integer, CourseSummary> courseSummaryMap = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourseNumber,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                studentList -> {
                                    List<StudentNameSurname> sortedStudents = studentList.stream()
                                            .map(student -> new StudentNameSurname(student.getName(), student.getSurname()))
                                            .sorted(Comparator.comparing(StudentNameSurname::getName).thenComparing(StudentNameSurname::getSurname))
                                            .toList();

                                    double averageMarks = studentList.stream()
                                            .flatMap(student -> student.getMarks().stream())
                                            .mapToInt(Integer::intValue)
                                            .average()
                                            .orElse(0.0);
                                    return new CourseSummary(sortedStudents, averageMarks);
                                })));
        return courseSummaryMap;
    }
}

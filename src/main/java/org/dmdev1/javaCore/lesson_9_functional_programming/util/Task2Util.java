package org.dmdev1.javaCore.lesson_9_functional_programming.util;

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

public final class Task2Util {
    private Task2Util() {
    }


    public static Map<Integer, List<StudentNameSurname>> task2(List<Student> students) {
        Map<Integer, List<StudentNameSurname>> studentsByCourse = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getCourseNumber,
                        Collectors.mapping(
                                student -> new StudentNameSurname(student.getName(), student.getSurname()),
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> list.stream()
                                                .sorted(Comparator.comparing(StudentNameSurname::getName).thenComparing(StudentNameSurname::getSurname))
                                                .toList()
                                )
                        )
                ));
        return studentsByCourse;
    }


}

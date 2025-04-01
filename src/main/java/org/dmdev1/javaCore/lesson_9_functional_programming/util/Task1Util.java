package org.dmdev1.javaCore.lesson_9_functional_programming.util;

import org.dmdev1.javaCore.lesson_9_functional_programming.dto.Student;

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

public final class Task1Util {
    private Task1Util() {
    }


    public static Map<Integer, Double> task1(List<Student> students) {
        Map<Integer, Double> courseAvgMarks = students.stream()
                .filter(student -> student.getMarks().size() > 3)
                .collect(Collectors.groupingBy(
                        Student::getCourseNumber,
                        Collectors.averagingDouble(student -> student.getMarks().stream()
                                .mapToInt(Integer::intValue)
                                .average()
                                .orElse(0.0))
                ));
        return courseAvgMarks;
    }


}

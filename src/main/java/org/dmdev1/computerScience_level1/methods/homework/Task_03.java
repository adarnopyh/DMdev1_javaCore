package org.dmdev1.computerScience_level1.methods.homework;

/*
* Задание 3

Даны два прямоугольных треугольника.
Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.
* */

public class Task_03 {

    public static void main(String[] args) {
        double triangle1 = triangleArea(2, 3);
        double triangle2 = triangleArea(4, 1);
        System.out.println(trianglesCompare(triangle1, triangle2));

    }

    public static double triangleArea (int a, int b) {
        return a > 0 && b > 0 ? (a * b) / 2 : Double.NaN;
    }

    public static String trianglesCompare (double tr1, double tr2) {
        return tr1 > tr2 ? "первый треугольник больше" :
                tr1 < tr2 ? "первый треугольник меньше" : "первый треугольник равен второму";
    }
}
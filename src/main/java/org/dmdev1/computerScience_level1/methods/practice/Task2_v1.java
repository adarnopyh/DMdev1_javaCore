package org.dmdev1.computerScience_level1.methods.practice;

/* Задача 2
Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - целочисленные параметры функции run.

Вывести корни квадратного уравнения на консоль.
Если их два, то перечислить каждый с новой строки в консоли (просто использовать два раза System.out.println).
Если дискриминант отрицательный, вывести на консоль сообщение "нет корней".

При решении создать и использовать следующие функции:

- функция isPositive, определяющая, является ли число положительным

- функция isZero, определяющая, является ли число нулём

- функция discriminant, вычисляющая дискриминант

Обращайте внимание, что параметры все целочисленные, а корни могут иметь дробную часть.
*/

public class Task2_v1 {
    public static void main(String[] args) {
        run(1, 2, 1);

    }

    private static void run(int a, int b, int c) {

        double disc = discriminant(a, b, c);

        if (isPositive(disc)) {
            double sqrtDisc = Math.sqrt(disc);
            double x1 = (-b + sqrtDisc) / (2 * a);
            double x2 = (-b - sqrtDisc) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (isZero(disc)) {
            double x = -b / (2.0 * a);
            System.out.println(x);
        } else {
            System.out.println("нет корней");
        }

    }

    private static boolean isPositive(double disc) {
        return disc > 0;
    }

    private static boolean isZero(double disc) {
        return disc == 0;
    }

    private static double discriminant(int a, int b, int c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
}

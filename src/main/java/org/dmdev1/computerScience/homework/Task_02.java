package org.dmdev1.computerScience.homework;


/*
* Задание 2

Даны 3 переменные:

- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)

Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.

Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
*
* */


public class Task_02 {
    public static void main(String[] args) {
        System.out.println(run(999, 2, '+'));
        System.out.println(run(10, 2.8, '-'));
        System.out.println(run(10, 2, '*'));
        System.out.println(run(7, 5, '%'));
        System.out.println(run(11, 0, '/'));
    }

    public static double run(double operand1, double operand2, char operation) {
        return operation == '+' ? operand1 + operand2 :
                operation == '-' ? operand1 - operand2 :
                        operation == '*' ? operand1 * operand2 :
                                operation == '%' ? operand1 % operand2 :
                                        operation == '/' && operand2 != 0 ? operand1 / operand2 : Double.NaN;
    }

}

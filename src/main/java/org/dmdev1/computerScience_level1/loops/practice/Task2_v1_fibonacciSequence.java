package org.dmdev1.computerScience_level1.loops.practice;

/*
* Задача 2
Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
Решить двумя способами: с помощью цикла и с помощью рекурсии.
* */

public class Task2_v1_fibonacciSequence {
    public static void main(String[] args) {
        fibonacciSequence(4181);
    }

    public static void fibonacciSequence(int num) {
        int result = 1;
        for (int i = 0; result < num; i += result) {
            System.out.println(i);
            result += i;
            System.out.println(result < num ? result : "");
        }
    }

}
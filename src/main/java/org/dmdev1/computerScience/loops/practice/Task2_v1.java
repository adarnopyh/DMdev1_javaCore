package org.dmdev1.computerScience.loops.practice;

/*
* Задача 2
Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
Решить двумя способами: с помощью цикла и с помощью рекурсии.
* */

public class Task2_v1 {
    public static void main(String[] args) {
        fiboDigits(4181);
    }

    public static void fiboDigits(int num) {
        int result = 1;
        for (int i = 0; result < num; i += result) {
            System.out.println(i);
            result += i;
            System.out.println(result);
        }
    }

}

package org.dmdev1.computerScience.loops.practice;

/*
* Задача 1
Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
* */

import static java.lang.Math.abs;

public class Task1_v1_sumOfDigits {
    public static void main(String[] args) {
        System.out.println(getSumOfDigits(123));
        System.out.println(getSumOfDigits(1000200380));
        System.out.println(getSumOfDigits(-56));
        System.out.println(getSumOfDigits(0));
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        for (int i = num; i != 0; i /= 10) {
            sum += abs(i % 10);
        }
        return sum;
    }

}
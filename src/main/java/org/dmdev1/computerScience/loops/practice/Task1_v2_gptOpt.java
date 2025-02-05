package org.dmdev1.computerScience.loops.practice;

/*
* Задача 1
Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
* */

public class Task1_v2_gptOpt {
    public static void main(String[] args) {
        System.out.println(getSumOfDigits(123));
        System.out.println(getSumOfDigits(1000200380));
        System.out.println(getSumOfDigits(-56));
        System.out.println(getSumOfDigits(0));
    }

    private static int getSumOfDigits(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}

package org.dmdev1.computerScience_level1.loops.homework;

/*
Задание 2.
Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

Примечание: для решения может понадобиться функция возведение числа в степень: Math.pow(число, степень)
*/

public class Task2_v1_mirrorNumber_simple {
    public static void main(String[] args) {
        int num1 = 4508;
        int num2 = 4700;
        int num3 = 1234567;
        int num4 = 10;
        reverse(num1);
        reverse(num2);
        reverse(num3);
        reverse(num4);
    }

    static int count = 0;
    private static void reverse(int num) {
        if (getLastDigit(num) == 0 && count == 0) {
            num = trimZeros(num);
        }
        int lastDigit = 0;
        if (num > 10) {
            lastDigit = getLastDigit(num);
            System.out.print(lastDigit);
            count++;
            reverse(num / 10);
        } else {
            System.out.println(num);
            count = 0;
        }
    }

    private static int removeLastDigit(int num) {
        return num / 10;
    }

    private static int getLastDigit(int num) {
        return num % 10;
    }

    private static int trimZeros(int num) {
        return getLastDigit(num) == 0 ? trimZeros(removeLastDigit(num)) : num;
    }

}

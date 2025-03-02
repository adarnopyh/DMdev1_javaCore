package org.dmdev1.computerScience_level1.loops.homework;

/*
Задание 2.
Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

Примечание: для решения может понадобиться функция возведение числа в степень: Math.pow(число, степень)
*/

public class Task2_v2_mirrorNumber_gptHelp {
    public static void main(String[] args) {
        int num1 = 4508;
        int num2 = 4700;
        int num3 = 1234567;
        int num4 = 10000;
        int num5 = 0;
        int num6 = -11;
        System.out.println(reverse(num1) != 0 ? reverse(num1) : "Please input positive number");
        System.out.println(reverse(num2) != 0 ? reverse(num2) : "Please input positive number");
        System.out.println(reverse(num3) != 0 ? reverse(num3) : "Please input positive number");
        System.out.println(reverse(num4) != 0 ? reverse(num4) : "Please input positive number");
        System.out.println(reverse(num5) != 0 ? reverse(num5) : "Please input positive number");
        System.out.println(reverse(num6) != 0 ? reverse(num6) : "Please input positive number");
    }
    private static int reverse(int num) {
        if (num > 0) {
            num = trimZeros(num);
            int reversed = 0;
            int numDigits = (int) Math.log10(num) + 1;  // Get number of digits

            for (int i = 0; num != 0; i++) {
                int digit = num % 10;  // Extract last digit
                reversed += digit * Math.pow(10, numDigits - i - 1);
                num /= 10;
            }
            return reversed;
        } else {
            return 0;
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

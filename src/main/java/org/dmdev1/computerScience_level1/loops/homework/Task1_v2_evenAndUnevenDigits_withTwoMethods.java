package org.dmdev1.computerScience_level1.loops.homework;

/*
Задание 1.
Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).

Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
*/


import java.util.Scanner;

public class Task1_v2_evenAndUnevenDigits_withTwoMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input positive number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            StringBuffer sbEven = new StringBuffer();
            StringBuffer sbUneven = new StringBuffer();
            System.out.println("These are even digits: " + printEvenData(number, sbEven).delete(sbEven.length() - 2, sbEven.length()).append("."));
            System.out.println("These are uneven digits: " + printUnevenData(number, sbUneven).delete(sbUneven.length() - 2, sbUneven.length()).append("."));
        } else {
            System.out.println("Please input positive number");
        }
        scanner.close();

    }

    private static StringBuffer printEvenData(int number, StringBuffer sbEven) {

        if (number > 10) {
            sbEven.insert(0,  isEven(getLastDigit(number)) ? getLastDigit(number) + ", " : "");
            printEvenData(removeLastDigit(number), sbEven);
        } else {
                sbEven.insert(0, isEven(number) ? number + ", " : "");
        }
        return sbEven;
    }

    private static StringBuffer printUnevenData(int number, StringBuffer sbUneven) {

        if (number > 10) {
            sbUneven.insert(0, !isEven(getLastDigit(number)) ? getLastDigit(number) + ", " : "");
            printUnevenData(removeLastDigit(number), sbUneven);
        } else {
            sbUneven.insert(0, !isEven(number) ? number + ", " : "");
        }
        return sbUneven;
    }

    private static int removeLastDigit(int num) {
        return num / 10;
    }

    private static int getLastDigit(int num) {
        return num % 10;
    }

    private static boolean isEven(int digit) {
        return digit % 2 == 0;
    }

}


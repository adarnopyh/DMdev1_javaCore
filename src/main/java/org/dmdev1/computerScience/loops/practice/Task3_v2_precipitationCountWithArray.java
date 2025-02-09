package org.dmdev1.computerScience.loops.practice;

/*
* Задача 3

Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.

Программа должна выводить:

1. Количество дней
2. Сумму осадков за этот период
3. Среднее количество осадков за этот период
4. Максимальное количество дневных осадков за этот период

Не использовать массивы!
* */

import java.util.Scanner;

public class Task3_v2_precipitationCountWithArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество дней: ");
        int daysCount = scanner.nextInt();
        if (daysCount > 0) {
            int[] daysArr = new int[daysCount];
            for (int i = 0; i < daysArr.length; i++) {
                System.out.print("Величина осадков в день " + (i + 1) + ": ");
                daysArr[i] = scanner.nextInt();
            }

            printData(daysCount, daysArr);
            scanner.close();
        } else {
            System.out.println("Please input real days quantity");
        }
    }

    private static void printData(int days, int[] arr) {
        System.out.println("Количество дней: " + days);
        System.out.println("Сумма осадков за " + printDaysCountToString(days) + precipitationTotal(arr));
        System.out.println("Среднее количество осадков за " + printDaysCountToString(days) + precipitationTotal(arr) / days);
        System.out.println("Максимальное количество дневных осадков за " + printDaysCountToString(days) + maxValue(arr));
    }

    private static int precipitationTotal(int[] daysArray) {
        int sum = 0;
        for (int day : daysArray) {
            sum += day;
        }
        return sum;
    }

    private static int maxValue(int[] arr) {
        int maxValue = 0;
        for (int value : arr) {
            maxValue = Math.max(value, maxValue);
        }
        return maxValue;
    }

    private static String printDaysCountToString(int daysCount) {
        return daysCount == 1 || daysCount % 10 == 1 ? daysCount + " день: "
                : (daysCount > 1 && daysCount < 5) || (daysCount % 10 > 1 && daysCount % 10 < 5) ? daysCount + " дня: "
                : daysCount + " дней: ";
    }

}
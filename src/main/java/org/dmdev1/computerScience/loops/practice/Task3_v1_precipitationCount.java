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

public class Task3_v1_precipitationCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Количество дней: ");
        int daysQty = scanner.nextInt();

        if (daysQty > 0) {
            int maxValue = 0;
            int precipitationTotal = 0;
            int count = 1;
            for (int i = 0; i < daysQty; i++) {
                System.out.print("Величина осадков в день " + count + ": ");
                int precipitation = scanner.nextInt();
                count++;
                precipitationTotal += precipitation;
                maxValue = precipitation > maxValue ? precipitation : maxValue;

            }

            System.out.println("Количество дней: " + daysQty);
            System.out.println("Сумма осадков за этот период: " + precipitationTotal);
            System.out.println("Среднее количество осадков за этот период: " + precipitationTotal / daysQty);
            System.out.println("Максимальное количество дневных осадков за этот период: " + maxValue);

            scanner.close();
        } else {
            System.out.println("Please input real days quantity");
        }

    }
}
package org.dmdev1.computerScience.practice;

/*Задача 1
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
*/

import java.util.Scanner;

public class Task1_03_gptOpt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (isValidDate(day, month, year)) {
            int[] nextDate = nextDay(day, month, year);
            System.out.println("Next day is: " + formatDate(nextDate));
        } else {
            System.out.println("Your input: " + formatDate(new int[]{day, month, year}) + " is not valid.");
        }
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (year <= 0 || month < 1 || month > 12) {
            return false;
        }

        int maxDays = getDaysInMonth(month, year);
        return day >= 1 && day <= maxDays;
    }

    public static int getDaysInMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String formatDate(int[] date) {
        return date[0] + "." + date[1] + "." + date[2];
    }

    public static int[] nextDay(int day, int month, int year) {
        int maxDays = getDaysInMonth(month, year);

        if (day < maxDays) {
            day++;
        } else {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return new int[]{day, month, year};
    }

}
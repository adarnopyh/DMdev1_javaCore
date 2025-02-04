package org.dmdev1.computerScience.methods.practice;

/*Задача 1
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
*/

import java.util.Scanner;

public class Task1_v2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day: ");
        int day = scanner.nextInt();

        System.out.print("Enter the month: ");
        int month = scanner.nextInt();

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if (isValidDate(day, month, year)) {
            System.out.println("Next day is: " + formatDate(nextDay(day, month, year)[0], nextDay(day, month, year)[1], nextDay(day, month, year)[2]));
        } else {
            System.out.println("Your input: " + day + "." + month + "." + year + " is not valid");
        }
    }

    private static boolean isValidDate(int day, int month, int year) {
        if (year <= 0 || month < 1 || month > 12) {
            return false;
        }

        int maxDays = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> 31;
        };

        return day >= 1 && day <= maxDays;
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static String formatDate(int day, int month, int year) {
        return day + "." + month + "." + year;
    }

    private static int[] nextDay(int day, int month, int year) {
        if (month == 12 && day == 31) {
            year++;
            month = 1;
            day = 1;
        } else if (day == 30 && month == 4 ||
                day == 30 && month == 6 ||
                day == 30 && month == 9 ||
                day == 30 && month == 11 ||
                day == 31 && month == 1 ||
                day == 31 && month == 3 ||
                day == 31 && month == 5 ||
                day == 31 && month == 7 ||
                day == 31 && month == 8 ||
                day == 31 && month == 10 ||
                day == 28 && month == 2 && !isLeapYear(year) ||
                day == 29 && month == 2 && isLeapYear(year)) {
            day = 1;
            month++;
        } else {
            day++;
        }
        return new int[]{day, month, year};
    }

}
package org.dmdev1.computerScience_level1.methods.homework;
/*
* Задание 1

В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.
* */

public class Task_01 {

    public static void main(String[] args) {
        System.out.println(getQuarter(28));
    }

    public static String getQuarter(int minutes) {
        if (minutes >= 0 && minutes < 15) {
            return "в первую";
        } else if (minutes >= 15 && minutes < 30) {
            return "во вторую";
        } else if (minutes >= 30 && minutes < 45) {
            return "в третью";
        } else if (minutes >= 45 && minutes <= 59) {
            return "в четвертую";
        } else {
            return "Out of range";
        }
    }
}

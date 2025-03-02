package org.dmdev1.computerScience_level1.loops.homework;

/*
Задание 1.
Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).

Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
*/



public class Task1_v1_evenAndUnevenDigits {
    public static void main(String[] args) {

        StringBuffer sbEven = new StringBuffer();
        StringBuffer sbUneven = new StringBuffer();
        int num2 = 436763986;
        String str = printData(num2, sbEven, sbUneven);
        System.out.println(str.substring(0, str.length() - 2)  + ".");

    }

    private static String printData(int number, StringBuffer sbEven, StringBuffer sbUneven) {

        if(number > 10) {
            if (isEven(getLastDigit(number))) {
                sbEven.append(getLastDigit(number)).append(", ");
            } else {
                sbUneven.append(getLastDigit(number)).append(", ");
            }
            printData(removeLastDigit(number), sbEven, sbUneven);

        } else {
            if (isEven(number)) {
                sbEven.append(number).append(".");
            } else {
                sbUneven.append(number).append(".");
            }
        }
        return "These are even digits: " + sbEven + "\nAnd these are uneven digits: " + sbUneven;
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


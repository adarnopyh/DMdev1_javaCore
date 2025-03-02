package org.dmdev1.computerScience_level1.arrays.homework;

/*
Задание 2.
Дан одномерный массив символов.
Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]

Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
*/


public class Task2_v1_convertArray_charsToInteregs {
    public static void main(String[] args) {

        char[] array = new char[] {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        printCharArray(array);
        System.out.println();
        printIntArray(convertArray(array));

    }

    public static int[] convertArray(char[] array) {
        int[] numArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numArray[i] = array[i];

        }
        return numArray;

    }

    private static void printCharArray(char[] array) {
        for (char value : array) {
            System.out.print(value + " ");
        }
    }

    private static void printIntArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }


    }
}


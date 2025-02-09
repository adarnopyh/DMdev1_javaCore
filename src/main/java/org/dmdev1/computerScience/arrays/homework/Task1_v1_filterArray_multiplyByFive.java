package org.dmdev1.computerScience.arrays.homework;

/*
Задание 1.
Дан одномерный массив целых чисел.
Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
После удаления - умножить каждый элемент массива на его длину.
Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
*/


public class Task1_v1_filterArray_multiplyByFive {
    public static void main(String[] args) {

        int[] array = new int[]{3, 5, -6, 3, 2, -9, 0, -123};
        printArray(array);
        System.out.println();
        printArray(filterArray(array));

    }

    private static int[] filterArray(int[] array) {
        int[] positiveArray = new int[newArrSize(array)];
        int count = 0;
        for (int value : array) {

            if (value >= 0) {
                positiveArray[count] = value * 5;
                count++;
            }

        }
        return positiveArray;

    }

    private static int newArrSize(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value >= 0) {
                count++;
            }
        }
        return count;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
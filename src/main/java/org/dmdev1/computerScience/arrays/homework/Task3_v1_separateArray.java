package org.dmdev1.computerScience.arrays.homework;

/*
Задание 3.
Дан одномерный массив целых чисел.

Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
Возвращает функция эти три массива в виде одного двумерного.

Пример:

                                         [-4, -18]

[-4, 0, 1, 9, 0, -18, 3] -> [0, 0]

                                         [1, 9, 3]
*/


public class Task3_v1_separateArray {
    public static void main(String[] args) {

        int[] array = new int[]{-4, 0, 1, 9, 0, -18, 3};
        printArray(array);
        System.out.println("\nFiltered and Separated Arrays:");
        print2DArr(separateArray(array));

    }

    private static int[][] separateArray(int[] array) {
        int[][] arrayOfArrays = new int[3][0];
        int[] zerosArray = new int[arrSizes(array)[0]];
        int[] negativeArray = new int[arrSizes(array)[1]];
        int[] positiveArray = new int[arrSizes(array)[2]];

        int zCount = 0;
        int nCount = 0;
        int pCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zerosArray[zCount] = array[i];
                zCount++;
            } else if (array[i] < 0) {
                negativeArray[nCount] = array[i];
                nCount++;
            } else {
                positiveArray[pCount] = array[i];
                pCount++;
            }
        }
        arrayOfArrays[0] = zerosArray;
        arrayOfArrays[1] = negativeArray;
        arrayOfArrays[2] = positiveArray;

        return arrayOfArrays;
    }

    private static int[] arrSizes(int[] arr) {
        int[] counters = new int[3];
        int counter1ForZeros = 0;
        int counter2ForNegatives = 0;
        int counter3ForPositives = 0;
        for (int value : arr) {
            if (value == 0) {
                counter1ForZeros++;
            } else if (value < 0) {
                counter2ForNegatives++;
            } else {
                counter3ForPositives++;
            }
        }
        counters[0] = counter1ForZeros;
        counters[1] = counter2ForNegatives;
        counters[2] = counter3ForPositives;
        return counters;
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void print2DArr(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
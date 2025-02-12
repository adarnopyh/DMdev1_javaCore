package org.dmdev1.computerScience.arrays.homework;

import java.util.Arrays;

public class Task3_v2_mentor {

    private static final int NEGATIVE_ARRAY_INDEX = 0;
    private static final int POSITIVE_ARRAY_INDEX = 1;
    private static final int ZERO_ARRAY_INDEX = 2;

    public static void main(String[] args) {
        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        System.out.println("Изначальный массив: " + Arrays.toString(values));
        int[][] result = getNumbers(values);
        printTwoDimensionalArray(result);

    }

    private static int[][] getNumbers(final int[] values) {
        int[][] result = new int[3][];
        int negativeCount = 0;
        int positiveCount = 0;
        int zerosCount = 0;

        for (int value : values) {
            if (value < 0) {
                negativeCount++;
            } else if (value > 0) {
                positiveCount++;
            } else {
                zerosCount++;
            }
        }
        result[NEGATIVE_ARRAY_INDEX] = new int[negativeCount];
        result[POSITIVE_ARRAY_INDEX] = new int[positiveCount];
        result[ZERO_ARRAY_INDEX] = new int[zerosCount];

        return TwoDimensionalArray(result, values);
    }

    private static int[][] TwoDimensionalArray(int[][] array, int[] values) {

        int negativeIndex = 0;
        int positiveIndex = 0;
        int zerosIndex = 0;

        for (int value : values) {
            if (value < 0) {
                array[NEGATIVE_ARRAY_INDEX][negativeIndex] = value;
                negativeIndex++;
            } else if (value > 0) {
                array[POSITIVE_ARRAY_INDEX][positiveIndex] = value;
                positiveIndex++;
            } else {
                array[ZERO_ARRAY_INDEX][zerosIndex] = value;
                zerosIndex++;
            }
        }
        return array;
    }

    private static void printTwoDimensionalArray(int[][] result) {
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
}


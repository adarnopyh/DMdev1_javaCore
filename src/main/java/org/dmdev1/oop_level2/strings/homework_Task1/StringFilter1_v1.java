package org.dmdev1.oop_level2.strings.homework_Task1;

public class StringFilter1_v1 {

    public static void main(String[] args) {
        String str = "abc Cpddd Dio OsfWw";
        String output = removeConsecutiveDuplicatesAndSpaces(str);
        System.out.println(output);
    }


    private static String removeConsecutiveDuplicatesAndSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        char prevChar = '\0';

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                char upperC = Character.toUpperCase(c);
                if (upperC != prevChar) {
                    sb.append(upperC);
                }
                prevChar = upperC;
            }
        }
        return sb.toString().toUpperCase();

    }
}

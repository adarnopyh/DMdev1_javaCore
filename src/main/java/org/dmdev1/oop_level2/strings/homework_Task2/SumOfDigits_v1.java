package org.dmdev1.oop_level2.strings.homework_Task2;

public class SumOfDigits_v1 {

    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

        int[] digits = digitsFilter(str);
        int sum = digitsSum(digits);

        System.out.println("Sum of all digits is: " + sum);
    }

        public static int[] digitsFilter(String str) {
            StringBuilder digits = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (Character.isDigit(c)) {
                    digits.append(c);
                }
            }

            int[] result = new int[digits.length()];
            for (int i = 0; i < digits.length(); i++) {
                result[i] = Character.getNumericValue(digits.charAt(i));
            }

            return result;
        }

        public static int digitsSum(int[] digits) {
            int sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            return sum;
        }


}

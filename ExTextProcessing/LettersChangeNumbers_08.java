package ExTextProcessing;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\s+");

        double totalResult = 0;

        for (String code : inputArr) {

            double result = modifiedNumber(code);

            totalResult += result;


        }

        System.out.printf("%.2f", totalResult);
    }

    private static double modifiedNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            int letterPositiion = (int) firstLetter - 64;
            number /= letterPositiion;
        } else {
            int letterPositiion = (int) firstLetter - 96;
            number *= letterPositiion;

        }
        if (Character.isUpperCase(secondLetter)) {
            int letterPositiion = (int) secondLetter - 64;
            number -= letterPositiion;
        } else {
            int letterPositiion = (int) secondLetter - 96;
            number += letterPositiion;
        }
        return number;
    }
}

package ExamPreparation;

import java.util.Scanner;

public class ActivationKey_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder rawKey = new StringBuilder(scanner.nextLine());
        String inputCommand = scanner.nextLine();


        while (!inputCommand.equals("Generate")) {
            String[] commandArr = inputCommand.split(">>>");

            if (inputCommand.contains("Contains")) {
                String substring = commandArr[1];

                if (rawKey.toString().contains(substring)) {
                    System.out.println(rawKey + " contains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (inputCommand.contains("Flip")) {
                String upperOrLowerCase = commandArr[1];
                int startIndex = Integer.parseInt(commandArr[2]);
                int endIndex = Integer.parseInt(commandArr[3]);
                String textPart = rawKey.substring(startIndex, endIndex);

                if (upperOrLowerCase.equals("Upper")) {
                    rawKey.replace(startIndex, endIndex, textPart.toUpperCase());
                } else if (upperOrLowerCase.equals("Lower")) {
                    rawKey.replace(startIndex, endIndex, textPart.toLowerCase());
                }
                System.out.println(rawKey.toString());
            } else if (inputCommand.contains("Slice")) {
                int startIndex = Integer.parseInt(commandArr[1]);
                int endIndex = Integer.parseInt(commandArr[2]);
                rawKey.delete(startIndex, endIndex);
                System.out.println(rawKey.toString());
            }

            inputCommand = scanner.nextLine();
        }

        System.out.println("Your activation key is: " + rawKey.toString());


    }
}

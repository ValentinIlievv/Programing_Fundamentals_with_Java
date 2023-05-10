package FinalExam;

import java.util.Scanner;

public class StringGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] inputArr = input.split("\\s+");
            String command = inputArr[0].toLowerCase();

            switch (command) {
                case "change":
                    String symbols = inputArr[1];
                    String replacement = inputArr[2];
                    text = text.replaceAll(symbols, replacement);
                    System.out.println(text);

                    break;
                case "includes":
                    String substring = inputArr[1];
                    if (text.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "end":
                    String endSubstring = inputArr[1];
                    boolean end = text.endsWith(endSubstring);
                    if (end) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "findindex":
                    char symbol = inputArr[1].charAt(0);
                    int indexPosition = giveMeIndexPosition(text, symbol);
                    System.out.println(indexPosition);
                    break;
                case "cut":
                    int startIndex = Integer.parseInt(inputArr[1]);
                    int count = Integer.parseInt(inputArr[2]);
                    String cutText = text.substring(startIndex, startIndex + count);
                    text = cutText;
                    System.out.println(text);
                    break;

            }


            input = scanner.nextLine();
        }
    }

    public static int giveMeIndexPosition(String text, char symbol) {
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if (currentSymbol == symbol) {
                index = i;
                return index;
            }
        }
        return index;
    }
}

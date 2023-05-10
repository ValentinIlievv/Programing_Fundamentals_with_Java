package ExTextProcessing;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        String firstWord = inputArr[0];
        String secondWord = inputArr[1];

        int result = sumOfSymbols(firstWord, secondWord);

        System.out.println(result);

    }

    private static int sumOfSymbols(String firstWord, String secondWord) {
        int result = 0;

        if (firstWord.length() >= secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                if (i <= secondWord.length() - 1) {
                    char firstWordSymbol = firstWord.charAt(i);
                    char secondWordSymbol = secondWord.charAt(i);
                    int multiply = firstWordSymbol * secondWordSymbol;
                    result += multiply;
                } else {
                    for (int j = i; j < firstWord.length(); j++) {
                        int symbolValue = firstWord.charAt(j);
                        result += symbolValue;
                    }
                    break;
                }
            }
        } else if (secondWord.length() > firstWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                if (i <= firstWord.length() - 1) {
                    char firstWordSymbol = firstWord.charAt(i);
                    char secondWordSymbol = secondWord.charAt(i);
                    int multiply = firstWordSymbol * secondWordSymbol;
                    result += multiply;
                } else {
                    for (int j = i; j < secondWord.length(); j++) {
                        int symbolValue = secondWord.charAt(j);
                        result += symbolValue;
                    }
                    break;
                }
            }
        }
        return result;
    }
}

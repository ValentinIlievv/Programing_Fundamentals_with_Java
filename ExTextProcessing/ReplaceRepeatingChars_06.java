package ExTextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        char firstOccur = textInput.charAt(0);
        String result = "";
        result += firstOccur;

        for (int i = 1; i < textInput.length() ; i++) {
            char currentSymbol = textInput.charAt(i);

            if (currentSymbol != firstOccur){
                result += currentSymbol;
                firstOccur = currentSymbol;
            }

        }

        System.out.println(result);
    }
}

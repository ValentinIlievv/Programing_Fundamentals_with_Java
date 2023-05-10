package TextProcessing;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        while (!textInput.equals("end")) {

            StringBuilder reversedSb = new StringBuilder();
            for (int i = textInput.length() - 1; i >= 0; i--) {
                char symbol = textInput.charAt(i);
                reversedSb.append(symbol);
            }
            System.out.println(textInput + " = " + reversedSb.toString());

            textInput = scanner.nextLine();
        }
    }
}

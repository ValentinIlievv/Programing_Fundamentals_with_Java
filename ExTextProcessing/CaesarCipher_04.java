package ExTextProcessing;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (char symbol : inputText.toCharArray()) {
            char encryptSymbol = (char)(symbol + 3);
            encryptedText.append(encryptSymbol);
        }

        System.out.println(encryptedText);
    }
}

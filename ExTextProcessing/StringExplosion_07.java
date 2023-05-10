package ExTextProcessing;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textInput = scanner.nextLine();

        StringBuilder textBuilder = new StringBuilder(textInput);
        int totalStrenght = 0;

        for (int i = 0; i < textBuilder.length(); i++) {
            char currentSymbol = textBuilder.charAt(i);

            if (currentSymbol == '>') {

                int explosionStrenght = Integer.parseInt(textBuilder.charAt(i + 1) + "");
                totalStrenght += explosionStrenght;

            } else if (currentSymbol != '>' && totalStrenght > 0) {
                textBuilder.deleteCharAt(i);
                totalStrenght--;
                i--;
            }
        }
        System.out.println(textBuilder);
    }
}


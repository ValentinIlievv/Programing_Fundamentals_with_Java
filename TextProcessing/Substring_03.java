package TextProcessing;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int index = text.indexOf(wordToRemove);

        while (index != -1) {

            text = text.replace(wordToRemove, "");

            index = text.indexOf(wordToRemove);
        }

        System.out.println(text);
    }
}

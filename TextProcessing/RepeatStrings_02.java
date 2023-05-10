package TextProcessing;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textInput = scanner.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < textInput.length; i++) {
            String word = textInput[i];
            int size = word.length();

            for (int j = 0; j < size; j++) {

                sb.append(word);
            }

        }

        System.out.println(sb.toString());


    }
}

package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<string>[A-Za-z]{8,})\\]";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                String command = matcher.group("command");
                String validText = matcher.group("string");
                System.out.print(command + ": ");
                for (int j = 0; j < validText.length(); j++) {
                    char symbol = validText.charAt(j);
                   int value = (int)(symbol);
                    System.out.printf("%d ", value);
                }
                System.out.println();
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}

package ExTextProcessing;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(", ");

        for (int i = 0; i < inputArr.length; i++) {
            String username = inputArr[i];
            String validUsername = "";
            for (int index = 0; index < username.length(); index++) {
                char symbol = username.charAt(index);

                if (Character.isLetter(symbol) || Character.isDigit(symbol) || symbol == '-' || symbol == '_') {
                    validUsername += symbol;

                    if (validUsername.equals(username)) {
                        if (username.length() >= 3 && username.length() <= 16) {
                            System.out.println(username);
                        }
                    }
                }
            }
        }

    }
}

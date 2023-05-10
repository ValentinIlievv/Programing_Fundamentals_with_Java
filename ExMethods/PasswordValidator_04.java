package ExMethods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isPasswordLenghtValid = passwordLenght(password);

        if (!isPasswordLenghtValid) {

            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isPasswordSymbolsValid = symbolsValid(password);

        if (!isPasswordSymbolsValid) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isPasswordDigitCountValid = isDigitCountValid(password);

        if (!isPasswordDigitCountValid){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLenghtValid && isPasswordSymbolsValid && isPasswordDigitCountValid){
            System.out.println("Password is valid");
        }


    }

    public static boolean passwordLenght(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean symbolsValid(String password) {

        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigitCountValid(String password) {
                int digitCount = 0;
        for (char symbol: password.toCharArray()) {
            if (Character.isDigit(symbol)){
                digitCount++;
            }
        }
        return digitCount >= 2;
    }
}









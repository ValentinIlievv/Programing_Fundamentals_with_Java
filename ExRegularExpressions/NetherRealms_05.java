package ExRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split("\\s*,\\s*");

        // String letterRegex = "[A-Za-z]";
        String letterRegex = "[^0-9+\\-*/.]";
        Pattern letterPattern = Pattern.compile(letterRegex);

        String digitRegex = "(\\+?-?[0-9]+\\.?[0-9]*)";
        Pattern digitPattern = Pattern.compile(digitRegex);


        for (int i = 0; i < inputArr.length; i++) {
            Matcher letterMatcher = letterPattern.matcher(inputArr[i]);
            Matcher digitMatcher = digitPattern.matcher(inputArr[i]);

            double damage = 0;
            StringBuilder deamonName = new StringBuilder();

            while (letterMatcher.find()) {
                deamonName.append(letterMatcher.group());
            }

            while (digitMatcher.find()) {
                double num = Double.parseDouble(digitMatcher.group());
                damage += num;
            }
            double finalDamage = getFinalDamage(inputArr[i], damage);
            int health = getHealth(deamonName);
            System.out.printf("%s - %d health, %.2f damage%n", inputArr[i], health, finalDamage);


        }

    }

    private static int getHealth(StringBuilder deamonName) {
        int health = 0;
        for (int i = 0; i < deamonName.length(); i++) {
            char symbol = deamonName.toString().charAt(i);
            health += symbol;
        }
        return health;
    }

    private static double getFinalDamage(String input, double damage) {

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            if (symbol == '*') {
                damage = damage * 2;
            } else if (symbol == '/') {
                damage = damage / 2;

            }
        }
        return damage;
    }
}



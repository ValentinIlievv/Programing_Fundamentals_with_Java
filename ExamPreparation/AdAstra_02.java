package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(#|\\|)(?<foodName>[A-Za-z\\s]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder outputData = new StringBuilder();
        int totalCalories = 0;

        while (matcher.find()) {
            String foodName = matcher.group("foodName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            totalCalories += calories;

            outputData.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, expirationDate, calories));
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);
        System.out.println(outputData);
    }
}

package ExRegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessage = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> attackedPlanetsCount = new ArrayList<>();
        List<String> destroyedPlanetsCount = new ArrayList<>();

        for (int i = 1; i <= numberOfMessage; i++) {
            String encyptedMessage = scanner.nextLine();
            String decryptedMessage = getDecryptedMessage(encyptedMessage);

            Matcher matcher = pattern.matcher(decryptedMessage);

            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attackType");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attackType.equals("A")) {
                    attackedPlanetsCount.add(planetName);
                } else if (attackType.equals("D")) {
                    destroyedPlanetsCount.add(planetName);
                }

            }
        }
        System.out.println("Attacked planets: " + attackedPlanetsCount.size());
        Collections.sort(attackedPlanetsCount);
        attackedPlanetsCount.forEach(n -> System.out.println("-> " + n));

        System.out.println("Destroyed planets: " + destroyedPlanetsCount.size());
        Collections.sort(destroyedPlanetsCount);
        destroyedPlanetsCount.forEach(n -> System.out.println("-> " + n));


    }

    private static String getDecryptedMessage(String encyptedMessage) {
        int lettersCount = getLettersCount(encyptedMessage);
        StringBuilder decryptedText = new StringBuilder();

        for (char symbol : encyptedMessage.toCharArray()) {

            char decryptSymbol = (char) (symbol - lettersCount);
            decryptedText.append(decryptSymbol);

        }
        return decryptedText.toString();
    }

    private static int getLettersCount(String encyptedMessage) {
        int count = 0;

        for (char symbol : encyptedMessage.toCharArray()) {

            switch (symbol) {

                case 's':
                case 'S':
                case 't':
                case 'T':
                case 'a':
                case 'A':
                case 'r':
                case 'R':
                    count++;
                    break;
            }
        }
        return count;
    }
}

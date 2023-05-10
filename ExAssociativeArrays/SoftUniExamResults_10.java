package ExAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> pointsMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> languageMap = new LinkedHashMap<>();


        while (!input.equals("exam finished")) {
            String[] inputArr = input.split("-");
            if (inputArr[1].equals("banned")) {
                pointsMap.remove(inputArr[0]);
                input = scanner.nextLine();
                continue;
            }
            String username = inputArr[0];
            String language = inputArr[1];
            int points = Integer.parseInt(inputArr[2]);

            if (!pointsMap.containsKey(username)) {
                pointsMap.put(username, points);
                if (languageMap.containsKey(language)) {
                    int currentValue = languageMap.get(language);
                    languageMap.put(language, currentValue + 1);
                } else {
                    languageMap.put(language, 1);
                }
            } else if (pointsMap.containsKey(username)) {
                int currentPoint = pointsMap.get(username);
                if (points > currentPoint){
                    pointsMap.put(username, points);
                }

                else if (!languageMap.containsKey(language)) {
                    languageMap.put(language, 0);
                }
                int currentValue = languageMap.get(language);
                languageMap.put(language, currentValue + 1);
            }


            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : pointsMap.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());

        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }


    }
}


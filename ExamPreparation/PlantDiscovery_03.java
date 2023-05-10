package ExamPreparation;

import java.util.*;

public class PlantDiscovery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Integer> plantRarityMap = new LinkedHashMap<>();
        LinkedHashMap<String, List<Double>> plantRatingMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantInputArr = scanner.nextLine().split("<->");
            String plantName = plantInputArr[0];
            int plantRarity = Integer.parseInt(plantInputArr[1]);
            plantRarityMap.put(plantName, plantRarity);
            plantRatingMap.put(plantName, new ArrayList<Double>());
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String[] commandArr = command.split(":");
            String commandName = commandArr[0];
            String plantName = commandArr[1].split("\\s+-\\s+")[0].trim();

            switch (commandName) {

                case "Rate":
                    if (isExist(plantRarityMap, plantName)) {
                        double rating = Double.parseDouble(commandArr[1].split("\\s+-\\s+")[1].trim());
                        plantRatingMap.get(plantName).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    if (isExist(plantRarityMap, plantName)) {
                        int newRarity = Integer.parseInt(commandArr[1].split("\\s+-\\s+")[1].trim());
                        plantRarityMap.put(plantName, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    if (isExist(plantRarityMap, plantName)) {
                        plantRatingMap.put(plantName, new ArrayList<Double>());
                    } else {
                        System.out.println("error");
                    }
                    break;
            }


            command = scanner.nextLine();
        }
        LinkedHashMap<String, Double> averageRatingMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : plantRatingMap.entrySet()) {
            //List<Double> gradeList = entry.getValue();
            //double averageGrade = getAverageValue(gradeList);
            List<Double> rattingList = entry.getValue();
            String key = entry.getKey();
            if (rattingList.size() > 0) {
                double averageRating = getAverage(rattingList);
                averageRatingMap.put(key, averageRating);
            } else {
                averageRatingMap.put(key, 0.0);
            }
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            String key = entry.getKey();
            Double averageRating = averageRatingMap.get(key);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", key, entry.getValue(), averageRating);

        }
    }

    private static boolean isExist(LinkedHashMap<String, Integer> map, String plantName) {
        boolean isExist = false;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getKey().equals(plantName)) {
                isExist = true;
            }
        }
        return isExist;
    }

    private static double getAverage(List<Double> list) {
        double averageSum = 0;
        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            double currentNum = list.get(i);
            averageSum += currentNum;
        }

        return averageSum / listSize;
    }
}

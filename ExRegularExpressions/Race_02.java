package ExRegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names = scanner.nextLine();

        List<String> racersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        LinkedHashMap<String, Integer> racersDistanceMap = new LinkedHashMap<>();

        racersNames.forEach(name -> racersDistanceMap.put(name, 0));

        String regexName = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(regexName);


        String regexDistance = "[0-9]";
        Pattern patternDistance = Pattern.compile(regexDistance);
        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            StringBuilder racerName = new StringBuilder();
            Matcher matcherName = patternName.matcher(input);

            while (matcherName.find()) {
                racerName.append(matcherName.group());
            }

            Matcher matcherDistance = patternDistance.matcher(input);
            int totalDistance = 0;

            while (matcherDistance.find()) {
                totalDistance += Integer.parseInt(matcherDistance.group());
            }

            if (racersNames.contains(racerName.toString())) {
                int currentDistance = racersDistanceMap.get(racerName.toString());
                racersDistanceMap.put(racerName.toString(), totalDistance + currentDistance);
            }

            input = scanner.nextLine();

        }
        List<String> top3Names = racersDistanceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + top3Names.get(0));
        System.out.println("2nd place: " + top3Names.get(1));
        System.out.println("3rd place: " + top3Names.get(2));
    }
}

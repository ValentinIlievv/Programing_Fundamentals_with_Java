package ExList;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        List<String> numList = Arrays.stream(numbers.split("\\|")).collect(Collectors.toList());

        Collections.reverse(numList);

        System.out.println(numList.toString().replaceAll("[\\[\\],]", "").
                replaceAll("\\s+", " ").trim());


    }
}

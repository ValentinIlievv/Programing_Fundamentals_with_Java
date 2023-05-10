package ExAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        LinkedHashMap<Character, Integer> symbolsCount = new LinkedHashMap<>();


        for (char symbol : inputText.toCharArray()){
              if (symbol == ' '){
                  continue;
              }
            symbolsCount.putIfAbsent(symbol, 0);
            symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);

        }

       symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));


    }
}

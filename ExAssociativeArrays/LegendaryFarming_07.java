package ExAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        LinkedHashMap<String, Integer> keyMaterialsMap = new LinkedHashMap<>();
        keyMaterialsMap.put("shards", 0);
        keyMaterialsMap.put("fragments", 0);
        keyMaterialsMap.put("motes", 0);

        LinkedHashMap<String, Integer> junkMaterialsMap = new LinkedHashMap<>();

        while (!isWin(keyMaterialsMap)) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            for (int i = 0; i < inputArr.length; i += 2) {
                int quantity = Integer.parseInt(inputArr[i]);
                String material = inputArr[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentValue = keyMaterialsMap.get(material);
                    keyMaterialsMap.put(material, currentValue + quantity);
                } else {
                    if (junkMaterialsMap.containsKey(material)) {
                        int currenValue = junkMaterialsMap.get(material);
                        junkMaterialsMap.put(material, currenValue + quantity);
                    } else {
                        junkMaterialsMap.put(material, quantity);
                    }
                }
                if (isWin(keyMaterialsMap)) {
                    break;
                }
            }
        }
        String item = whichMaterialWin(keyMaterialsMap);

        if (item.equals("shards")) {
            System.out.println("Shadowmourne obtained!");
            keyMaterialsMap.put("shards", keyMaterialsMap.get("shards") - 250);
        } else if (item.equals("fragments")) {
            System.out.println("Valanyr obtained!");
            keyMaterialsMap.put("fragments", keyMaterialsMap.get("fragments") - 250);
        } else if (item.equals("motes")) {
            System.out.println("Dragonwrath obtained!");
            keyMaterialsMap.put("motes", keyMaterialsMap.get("motes") - 250);
        }

        for (Map.Entry<String, Integer> entry : keyMaterialsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : junkMaterialsMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }

    private static boolean isWin(LinkedHashMap<String, Integer> keyMap) {

        for (Map.Entry<String, Integer> entry : keyMap.entrySet()) {
            if (entry.getValue() >= 250) {
                return true;
            }
        }
        return false;
    }

    private static String whichMaterialWin(LinkedHashMap<String, Integer> keyMap) {
        String material = "";
        for (Map.Entry<String, Integer> entry : keyMap.entrySet()) {
            if (entry.getValue() >= 250) {
                material = entry.getKey();
            }
        }
        return material;
    }
}

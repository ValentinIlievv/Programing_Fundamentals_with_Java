package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Craft!")) {
            String[] commandInpurArr = commandInput.split(" - ");
            String command = commandInpurArr[0];
            String item = commandInpurArr[1];

            switch (command) {
                case "Collect":
                    if (!isExistItem(item, itemList)) {
                        itemList.add(item);
                    }
                    break;

                case "Drop":
                    if (isExistItem(item, itemList)) {
                        itemList.remove(item);
                    }
                    break;

                case "Combine Items":
                    String[] itemArr = item.split("\\:");
                    String item1 = itemArr[0];
                    String item2 = itemArr[1];


                    if (isExistItem(item1, itemList)) {

                        itemList.add(index(item1, itemList) + 1, item2);
                    }
                    break;

                case "Renew":
                    if (isExistItem(item, itemList)) {
                        int index = index(item, itemList);
                        itemList.remove(index);
                        itemList.add(item);

                    }
                    break;
            }


            commandInput = scanner.nextLine();
        }

        System.out.print(itemList.toString().replaceAll("[\\[\\]]", ""));
    }

    public static boolean isExistItem(String item, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static int index(String item, List<String> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(item)) {
                index = i;
            }
        }
        return index;
    }
}

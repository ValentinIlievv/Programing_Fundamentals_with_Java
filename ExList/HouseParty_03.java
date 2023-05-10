package ExList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> guestList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String commandInput = scanner.nextLine();
            String[] commanArr = commandInput.split(" ");

            if (commandInput.contains("not")) {
                String name = commanArr[0];
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            } else {
                String name = commanArr[0];
                if (guestList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestList.add(name);
                }
            }
        }
        for (String element : guestList) {
            System.out.println(element);
        }


    }
}

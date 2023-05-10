package ExArrays;

import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] trasureChest = scanner.nextLine().split("\\|");

        String command = scanner.nextLine();


        while (!command.equals("Yohoho!")) {

            if (command.contains("Loot")) {

            } else if (command.contains("Drop")) {

            } else if (command.contains("Steel")) {

            }

        }
    }
}

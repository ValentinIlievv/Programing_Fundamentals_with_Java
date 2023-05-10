package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friendList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String commandInput = scanner.nextLine();

        //List<String> blacklistedList = new ArrayList<>();
        //List<String> lostList = new ArrayList<>();
        List<Integer> blacklistedAndLost = new ArrayList<>();
        int blacklistedNames = 0;
        int lostNames = 0;

        while (!commandInput.equals("Report")) {
            String[] inputArr = commandInput.split("\\s+");
            String command = inputArr[0];

            switch (command) {
                case "Blacklist":
                    String name = inputArr[1];
                    if (isFoundName(name, friendList)) {
                        int index = indexPosition(name, friendList);

                        friendList.set(index, "Blacklisted");
                        System.out.printf("%s was blacklisted.%n", name);
                        blacklistedNames++;
                        blacklistedAndLost.add(index);
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;

                case "Error":
                    int index = Integer.parseInt(inputArr[1]);
                    String currentName = friendList.get(index);
                    if (isValidIndex(index, friendList)) {
                        if (isFoundIndex(index, blacklistedAndLost)) {
                            friendList.set(index, "Lost");
                            System.out.printf("%s was lost due to an error.%n", currentName);
                            blacklistedAndLost.add(index);
                            lostNames++;
                        }
                    }
                    break;

                case "Change":
                    int currentIndex = Integer.parseInt(inputArr[1]);
                    String newName = inputArr[2];
                    if (isValidIndex(currentIndex, friendList)) {
                        String previousName = friendList.get(currentIndex);
                        friendList.set(currentIndex, newName);
                        System.out.printf("%s changed his username to %s.%n", previousName, newName);
                    }

                    break;
            }


            commandInput = scanner.nextLine();
        }
        System.out.println("Blacklisted names:" + " " + blacklistedNames);
        System.out.println("Lost names:" + " " + lostNames);
        System.out.println(friendList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isFoundName(String name, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static int indexPosition(String name, List<String> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (name.equals(list.get(i))) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean isValidIndex(int index, List<String> list) {
        if (index >= 0 && index <= list.size() - 1) {
            return true;
        }
        return false;
    }

    public static boolean isFoundIndex(int index, List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            if (index == list.get(i)) {
                return false;
            }
        }
        return true;
    }
}

package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friendList = scanner.nextLine().split(", ");
        String commandInput = scanner.nextLine();


        List<Integer> blacklistedAndLost = new ArrayList<>();
        int blacklistedNames = 0;
        int lostNames = 0;
        int index = Integer.MIN_VALUE;

        while (!commandInput.equals("Report")) {
            String[] inputArr = commandInput.split("\\s+");
            String command = inputArr[0];


            switch (command) {
                case "Blacklist":
                    String name = inputArr[1];
                    if (isExistName(name, friendList)) {
                        index = indexFound(name, friendList);
                        if (isValidIndex(index, friendList)) {
                            friendList[index] = "Blacklisted";
                            System.out.printf("%s was blacklisted.%n", name);
                            blacklistedAndLost.add(index);
                            blacklistedNames++;
                        }
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }

                    break;

                case "Error":
                    index = Integer.parseInt(inputArr[1]);
                    if (isValidIndex(index, friendList)) {
                        String currentName = friendList[index];
                        if (!isBlacklisedOrLost(index, blacklistedAndLost)) {
                            System.out.printf("%s was lost due to an error.%n", currentName);
                            friendList[index] = "Lost";
                            blacklistedAndLost.add(index);
                            lostNames++;
                        }
                    }
                    break;

                case "Change":
                    int currentIndex = Integer.parseInt(inputArr[1]);
                    String newName = inputArr[2];
                    if (isValidIndex(currentIndex, friendList)) {
                        String oldName = friendList[currentIndex];
                        friendList[currentIndex] = newName;
                        System.out.printf("%s changed his username to %s.%n", oldName, newName);

                    }
                    break;
            }
            commandInput = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blacklistedNames);
        System.out.printf("Lost names: %d%n", lostNames);
        for (String element : friendList) {
            System.out.print(element + " ");
        }
    }

    public static boolean isExistName(String name, String[] nameArr) {

        for (int i = 0; i < nameArr.length; i++) {
            if (name.equals(nameArr[i])) {

                return true;
            }
        }
        return false;
    }

    public static int indexFound(String name, String[] nameArr) {
        int index = 0;

        for (int i = 0; i < nameArr.length; i++) {
            if (name.equals(nameArr[i])) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static boolean isValidIndex(int index, String[] namesArr) {
        if (index >= 0 && index <= namesArr.length - 1) {
            return true;
        }
        return false;
    }

    public static boolean isBlacklisedOrLost(int index, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (index == list.get(i)) {
                return true;
            }
        }
        return false;
    }
}

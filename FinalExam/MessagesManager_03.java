package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MessagesManager_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacityLimit = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        LinkedHashMap<String, Integer> sentMessagesMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> recievedMessagesMap = new LinkedHashMap<>();


        while (!input.equals("Statistics")) {
            String[] inputArr = input.split("=");
            String command = inputArr[0];

            switch (command) {
                case "Add":
                    String username = inputArr[1];
                    int sent = Integer.parseInt(inputArr[2]);
                    int recieved = Integer.parseInt(inputArr[3]);
                    if (!sentMessagesMap.containsKey(username)) {
                        int totalMessage = sent + recieved;
                        if (totalMessage < capacityLimit) {
                            sentMessagesMap.put(username, sent);
                            recievedMessagesMap.put(username, recieved);
                        }
                    }
                    break;
                case "Message":
                    String sender = inputArr[1];
                    String reciever = inputArr[2];
                    if (sentMessagesMap.containsKey(sender) && recievedMessagesMap.containsKey(reciever)) {
                        int totalSender = sentMessagesMap.get(sender) + recievedMessagesMap.get(sender);
                        int totalReciever = sentMessagesMap.get(reciever) + recievedMessagesMap.get(reciever);

                        if (totalSender + 1 < capacityLimit) {
                            int currentSents = sentMessagesMap.get(sender);
                            sentMessagesMap.put(sender, currentSents + 1);
                        } else {
                            System.out.printf("%s reached the capacity!%n", sender);
                            sentMessagesMap.remove(sender);
                            recievedMessagesMap.remove(sender);
                        }
                        if (totalReciever + 1 < capacityLimit) {
                            int currentRecieved = recievedMessagesMap.get(reciever);
                            recievedMessagesMap.put(reciever, currentRecieved + 1);
                        } else {
                            System.out.printf("%s reached the capacity!%n", reciever);
                            recievedMessagesMap.remove(reciever);
                            sentMessagesMap.remove(reciever);
                        }
                    }
                    break;
                case "Empty":
                    String deleteUsername = inputArr[1];
                    if (deleteUsername.equals("All")) {
                        sentMessagesMap.clear();
                        recievedMessagesMap.clear();
                    } else {
                        sentMessagesMap.remove(deleteUsername);
                        recievedMessagesMap.remove(deleteUsername);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Users count: " + sentMessagesMap.size());

        for (Map.Entry<String, Integer> entry : sentMessagesMap.entrySet()) {
            String username = entry.getKey();
            int sends = sentMessagesMap.get(username);
            int recieves = recievedMessagesMap.get(username);
            System.out.println(username + " - " + (sends + recieves));
        }

    }
}

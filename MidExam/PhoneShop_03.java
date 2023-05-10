package MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> phonesList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("End")) {
            String[] inputArr = inputCommand.split(" - ");
            String command = inputArr[0];

            switch (command) {
                case "Add":
                    String phoneModel = inputArr[1];
                    if (isExistPhone(phoneModel, phonesList)) {
                        phonesList.add(phoneModel);
                    }
                    break;

                case "Remove":
                    String removePhoneModel = inputArr[1];
                    if (!isExistPhone(removePhoneModel, phonesList)) {
                        int index = indexFound(removePhoneModel, phonesList);
                        phonesList.remove(index);
                    }
                    break;

                case "Bonus phone":
                    String[] phones = inputArr[1].split("\\:");
                    String oldPhone = phones[0];
                    String newPhone = phones[1];

                    if (!isExistPhone(oldPhone, phonesList)) {
                        int currentIndex = indexFound(oldPhone, phonesList);
                        phonesList.add(currentIndex + 1, newPhone);
                    }
                    break;

                case "Last":
                    String lastPhoneModel = inputArr[1];

                    if (!isExistPhone(lastPhoneModel, phonesList)) {
                        int indexPositin = indexFound(lastPhoneModel, phonesList);
                        phonesList.remove(indexPositin);
                        phonesList.add(lastPhoneModel);
                    }
                    break;

            }
            inputCommand = scanner.nextLine();
        }

        for (int i = 0; i < phonesList.size(); i++) {
            if (i == phonesList.size() - 1) {
                System.out.print(phonesList.get(i));
            } else {
                System.out.print(phonesList.get(i) + ", ");
            }
        }
    }

    public static boolean isExistPhone(String phoneModel, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (phoneModel.equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int indexFound(String phoneModel, List<String> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (phoneModel.equals(list.get(i))) {
                index = i;
                break;
            }
        }
        return index;
    }
}

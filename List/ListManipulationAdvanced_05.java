package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String lineInput = scanner.nextLine();

        while (!lineInput.equals("end")) {
            String[] commandInput = lineInput.split(" ");
            String command = commandInput[0];
            if (lineInput.equals("Print even")) {
                command = "Print even";
            } else if (lineInput.equals("Print odd")) {
                command = "Print odd";
            } else if (lineInput.equals("Get sum")) {
                command = "Get sum";
            }

            switch (command) {
                case "Contains":
                    int containNum = Integer.parseInt(commandInput[1]);
                    if (numList.contains(containNum)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print even":
                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) % 2 == 0) {
                            System.out.print(numList.get(i) + " ");
                        }
                    }
                    System.out.println();
                    break;

                case "Print odd":
                    for (int i = 0; i < numList.size(); i++) {
                        if (numList.get(i) % 2 != 0) {
                            System.out.print(numList.get(i) + " ");
                        }
                    }
                    System.out.println();
                    break;

                case "Get sum":
                    int sum = 0;
                    for (int i = 0; i < numList.size(); i++) {
                        sum += numList.get(i);
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = commandInput[1];
                    int number = Integer.parseInt(commandInput[2]);
                    switch (condition) {
                        case "<":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) < number) {
                                    System.out.print(numList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) > number) {
                                    System.out.print(numList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) >= number) {
                                    System.out.print(numList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numList.size(); i++) {
                                if (numList.get(i) <= number) {
                                    System.out.print(numList.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }

            lineInput = scanner.nextLine();
        }
    }
}


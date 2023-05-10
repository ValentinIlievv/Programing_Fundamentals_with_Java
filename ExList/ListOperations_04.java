package ExList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("End")) {


            if (commandInput.contains("Add")) {
                int addNum = Integer.parseInt(commandInput.split(" ")[1]);
                numList.add(addNum);

            } else if (commandInput.contains("Insert")) {
                int index = Integer.parseInt(commandInput.split(" ")[2]);
                int num = Integer.parseInt(commandInput.split(" ")[1]);
                if (!isValidIndex(index, numList)) {
                    System.out.println("Invalid index");
                } else {
                    numList.add(index, num);
                }
            } else if (commandInput.contains("Remove")) {
                int removeIndex = Integer.parseInt(commandInput.split(" ")[1]);
                if (!isValidIndex(removeIndex, numList)) {
                    System.out.println("Invalid index");
                } else {
                    numList.remove(removeIndex);
                }
            } else if (commandInput.contains("Shift left")) {
                int n = Integer.parseInt(commandInput.split(" ")[2]);
                for (int i = 1; i <= n; i++) {
                    int addNum = numList.get(0);
                    numList.remove(0);
                    numList.add(addNum);
                }

            } else if (commandInput.contains("Shift right")) {
                int n = Integer.parseInt(commandInput.split(" ")[2]);
                for (int i = 1; i <= n; i++) {
                    int addNum = numList.get(numList.size() - 1);
                    numList.remove(numList.size() - 1);
                    numList.add(0, addNum);
                }
            }
            commandInput = scanner.nextLine();
        }

        for (int index: numList) {
            System.out.print(index + " ");
        }
    }

    public static boolean isValidIndex(int index, List<Integer> list) {

        return index >= 0 && index <= list.size() - 1;
    }
}

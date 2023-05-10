package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String lineInput = scanner.nextLine();


        while (!lineInput.equals("end")) {
            String[] commandInput = lineInput.split(" ");
            String command = commandInput[0];
            switch (command) {
                case "Add":
                    int addNum = Integer.parseInt(commandInput[1]);
                    numList.add(addNum);
                    break;

                case "Remove":
                    int removeNum = Integer.parseInt(commandInput[1]);
                    numList.remove(Integer.valueOf(removeNum));
                    break;

                case "RemoveAt":
                    int removeIndex = Integer.parseInt(commandInput[1]);
                    numList.remove(removeIndex);
                    break;

                case "Insert":
                    int numToInsert = Integer.parseInt(commandInput[1]);
                    int indexToInsert = Integer.parseInt(commandInput[2]);
                    numList.add(indexToInsert, numToInsert);
                    break;
            }
            lineInput = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\]\\[,]", ""));

    }
}

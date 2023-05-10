package ExList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] inputArr = input.split(" ");
            String command = inputArr[0];

            if (command.equals("Delete")){
                int deleteNum = Integer.parseInt(inputArr[1]);
                numList.removeAll(Arrays.asList(deleteNum));

            }else if (command.equals("Insert")){
                int insertElement = Integer.parseInt(inputArr[1]);
                int insertPosition = Integer.parseInt(inputArr[2]);

                numList.add(insertPosition, insertElement);
            }
            input = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\]\\[,]", "") + " ");
    }
}

package ExList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int wagonsCapacity = Integer.parseInt(scanner.nextLine());

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("end")){

            String[] commandInputArr = commandInput.split(" ");
            String command = commandInputArr[0];

            if (command.equals("Add")){
                int addPassengers = Integer.parseInt(commandInputArr[1]);
                wagonsList.add(addPassengers);
            }else {
                int passengers = Integer.parseInt(commandInputArr[0]);
                for (int i = 0; i < wagonsList.size() ; i++) {
                    int sum = passengers + wagonsList.get(i);
                    if(sum <= wagonsCapacity){
                        wagonsList.set(i, sum);
                                break;
                    }
                }
            }
            commandInput = scanner.nextLine();
        }

        System.out.println(wagonsList.toString().replaceAll("[\\]\\[,]","") + " ");
    }
}

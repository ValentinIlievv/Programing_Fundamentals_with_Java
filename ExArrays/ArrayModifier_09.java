package ExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            String command = scanner.nextLine();


            while (!command.equals("end")){
                if (command.contains("swap")){
                    int index1 = Integer.parseInt(command.split(" ")[1]);
                    int index2 = Integer.parseInt(command.split(" ")[2]);

                    int element1 = numArr[index1];
                    int element2 = numArr[index2];

                    numArr[index1] = element2;
                    numArr[index2] = element1;
                }else if (command.contains("multiply")){
                    int index1 = Integer.parseInt(command.split(" ")[1]);
                    int index2 = Integer.parseInt(command.split(" ")[2]);

                    int element1 = numArr[index1];
                    int element2 = numArr[index2];

                    int multiply = element1 * element2;

                    numArr[index1]= multiply;


                }else if (command.equals("decrease")){

                    for (int index = 0; index < numArr.length ; index++) {

                        numArr[index]--;
                    }

                }

                command =scanner.nextLine();

            }
        for (int index = 0; index <= numArr.length - 1 ; index++) {
            int currentNumber = numArr[index];
            if (index != numArr.length - 1) {

                System.out.print(currentNumber + ", ");
            } else {
                System.out.print(currentNumber);
            }
        }

    }

}

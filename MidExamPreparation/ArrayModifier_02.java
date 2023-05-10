package MidExamPreparation;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
       String commandInput = scanner.nextLine();

       while (!commandInput.equals("end")){
           String command = commandInput.split("\\s+")[0];

           switch (command){
               case "swap":
                   int index1 = Integer.parseInt(commandInput.split("\\s+")[1]);
                   int index2 = Integer.parseInt(commandInput.split("\\s+")[2]);
                   int firstNum = numArr[index1];
                   int secondNum = numArr[index2];
                   numArr[index1] = secondNum;
                   numArr[index2] = firstNum;
                   break;

               case "multiply":
                   int firstIndex = Integer.parseInt(commandInput.split("\\s+")[1]);
                   int secondIndex = Integer.parseInt(commandInput.split("\\s+")[2]);
                   int firstNumber = numArr[firstIndex];
                   int secondNumber = numArr[secondIndex];
                   numArr[firstIndex] = firstNumber * secondNumber;
                   break;

               case "decrease":
                   for (int i = 0; i < numArr.length ; i++) {
                       numArr[i] = numArr[i] - 1;
                   }
                   break;
           }
           commandInput = scanner.nextLine();
       }
        for (int i = 0; i < numArr.length; i++) {
            if (i == numArr.length - 1){
                System.out.print(numArr[i]);
            }
            else {
                System.out.print(numArr[i] + ", ");
            }
        }
    }
}

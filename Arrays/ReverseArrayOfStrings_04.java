package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] inputArr = scanner.nextLine().split(" ");


        //for (int index = inputArr.length - 1; index >= 0; index--){

           //System.out.print(inputArr [index] + " ");
        // }
        //System.out.println();


        for (int i = 0; i <inputArr.length /2 ; i++) {
            String oldElement = inputArr[i];

            inputArr [i] = inputArr[inputArr.length - 1 - i];
            inputArr[inputArr.length - 1 - i] = oldElement;

        }

        for (String index    : inputArr   ) {
            System.out.print(index + " ");
        }
    }
}

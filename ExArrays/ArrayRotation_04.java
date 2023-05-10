package ExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= rotations ; rotation++) {
            int firstElement = numArr[0];

            for (int index = 0; index < numArr.length - 1 ; index++) {

                numArr[index]= numArr[ index +1];
            }

            numArr[numArr.length - 1] = firstElement;



        }
        for (int number: numArr) {
            System.out.print(number + " ");

        }
    }
}

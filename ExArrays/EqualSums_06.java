package ExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        boolean isEqual = false;

        for (int index = 0; index < numArr.length ; index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum += numArr[leftIndex];

            }
            for (int rightIndex = index +1; rightIndex < numArr.length ; rightIndex++) {
                rightSum += numArr[rightIndex];

            }

            if (rightSum == leftSum){

                System.out.print(index);
                isEqual = true;
                break;
            }
        }

        if (!isEqual){
            System.out.println("no");
        }
    }
}

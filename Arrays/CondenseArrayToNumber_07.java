package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] condensed = new int[numArr.length - 1];

        for (int index = 0; index < numArr.length ; index++) {

            if (numArr.length == 1) {

                break;
            }

            if (index == numArr.length - 1) {
                 index = -1;
                int[] condensedNew = new int[condensed.length - 1];
                numArr = condensed;
                condensed = condensedNew;

            } else {
                condensed[index] = numArr[index] + numArr[index + 1];
            }
        }

        System.out.println(numArr[0]);

          }
       }






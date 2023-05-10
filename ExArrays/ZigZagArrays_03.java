package ExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[input];
        int[] secondArr = new int[input];

        for (int i = 1; i <= input; i++) {
            int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            if (i % 2 == 0) {
                secondArr[i - 1] = numArr[0];
                firstArr[i - 1] = numArr[1];
            } else {
                firstArr[i - 1] = numArr[0];
                secondArr[i - 1] = numArr[1];

            }

        }

        for (int i = 0; i < firstArr.length ; i++) {

            System.out.print(firstArr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArr.length ; i++) {

            System.out.print(secondArr[i] + " ");
        }

        }

    }


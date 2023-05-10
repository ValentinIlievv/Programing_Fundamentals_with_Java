package ExMethods;

import java.util.Scanner;

public class NxN_Matrix_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        matrix(n);

    }
    public static void matrix (int n){

        int[] numArr = new int[n];
        arrayNumbers(n, numArr);

        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < numArr.length ; j++) {

                System.out.print(numArr[j] + " ");
            }
            System.out.println();

        }

    }
    public static void arrayNumbers (int num, int[] arr){

        for (int i = 0; i < num ; i++) {
            arr[i] = num;
        }
    }
}

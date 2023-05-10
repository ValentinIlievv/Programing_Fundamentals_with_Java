package ExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());


        for (int index = 0; index < numArr.length ; index++) {

            for (int i = index + 1; i < numArr.length ; i++) {

                int sum = numArr[index] + numArr[i];

                if (sum == magicSum){
                    System.out.println(numArr[index] + " " + numArr[i]);
                }
            }
        }
    }
}

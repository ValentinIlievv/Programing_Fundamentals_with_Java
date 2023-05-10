package ExArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();



        for (int index = 0; index < numbersArr.length ; index++) {
              boolean isTop = false;

              if (index == numbersArr.length - 1){
                  System.out.print(numbersArr[index]);
                  continue;
              }

            for (int i = index +1; i < numbersArr.length ; i++) {
                if (numbersArr[index] > numbersArr[i]){
                       isTop = true;
                }else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(numbersArr[index] + " ");
            }
        }
    }
}

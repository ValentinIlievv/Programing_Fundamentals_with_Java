package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        int even = 0;
        int odd = 0;

        for (int index = 0; index < numArr.length ; index++) {

            if (numArr[index] % 2 == 0){
               even += numArr[index];


            }else {
                odd += numArr[index];
            }

        }
        int diff = even - odd;
        System.out.println(diff);

    }
}

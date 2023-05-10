package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isValid = true;

        for (int index = 0; index < firstArr.length ; index++) {

            if (secondArr[index] == firstArr[index]){
                sum += firstArr[index];
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.",index);
                isValid = false;
                break;
            }
        }

       if (isValid ){
           System.out.printf("Arrays are identical. Sum: %d",sum);
       }
    }
}

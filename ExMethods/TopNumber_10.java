package ExMethods;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
          if (isSumOfDigitsDivisibleBy8(i) && isHoldOneOddDigit(i)){
              System.out.println(i);
          }
        }
    }
    public static boolean isSumOfDigitsDivisibleBy8 (int n){
       int sum = 0;
        while (n > 0){
            int lastNum = n % 10 ;

            sum += lastNum;

            n = n / 10;
        }
        return sum % 8 == 0;
    }
    public static boolean isHoldOneOddDigit (int n){

        while (n > 0){
            int lastNum = n % 10 ;

            if (lastNum % 2 != 0){
                return true;
            }

            n = n / 10;
        }
        return false;
    }
}

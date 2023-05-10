package ExDataTypesAndVariables;

import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        //245678

        while (num > 0){
          int lastDigit = num % 10;

          sum += lastDigit;

          num = num / 10;

        }

        System.out.println(sum);
    }
}

package Methods;

import java.util.Scanner;

public class MultiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numInput = Math.abs(Integer.parseInt(scanner.nextLine()));


        System.out.println(sum(numInput));


    }

    public static int evenNums(int num) {
        int evenSum = 0;

        for (int i = 1; i <= num; i++) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            }
            num = num / 10;
        }
        if (num % 2 == 0) {
            evenSum += num;

        }
        return evenSum;
    }

    public static int oddNums(int num) {
        int oddSum = 0;

        for (int i = 0; i <= num; i++) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                oddSum += lastDigit;
            }
            num = num / 10;
        }
        if (num % 2 != 0) {
            oddSum += num;
        }
        return oddSum;

    }
    public static int sum (int num){
        int evenSum = evenNums(num);
        int oddSum = oddNums(num);

        return evenSum * oddSum;
    }

}


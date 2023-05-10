package ExMethods;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFact = factoriel(firstNum) ;
        long secondFact = factoriel(secondNum);

        double result = firstFact * 1.0 / secondFact ;


        System.out.printf("%.2f", result );
    }

    public static long factoriel(int num) {
        long factoriel = 1;
        for (int i = 1; i <= num; i++) {
            factoriel = factoriel * i;
        }
        return factoriel;
    }
}

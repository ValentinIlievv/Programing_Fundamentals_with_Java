package ExDataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalAmount = 0;
        int days = 0;


        while (startingYield >= 100){

            int crewSpices = startingYield - 26;
            totalAmount += crewSpices;
            startingYield -= 10;
            days++;

        }

        System.out.println(days);
        if (totalAmount >= 26) {
            totalAmount -= 26;
        }
        System.out.println(totalAmount);


    }
}

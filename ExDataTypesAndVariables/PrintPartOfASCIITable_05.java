package ExDataTypesAndVariables;

import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstSymbol = Integer.parseInt(scanner.nextLine());
        int lastSymbol = Integer.parseInt(scanner.nextLine());


        for (int symbol = firstSymbol; symbol <= lastSymbol ; symbol++) {

            System.out.print((char) symbol + " ");

        }


    }
}

package ExMethods;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbols(firstSymbol, secondSymbol);
    }

    public static void printSymbols(char firstSymbol, char secondSymbol) {

        if (firstSymbol < secondSymbol) {

            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char) (secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }

        }
    }
}

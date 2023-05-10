package ExMethods;

import java.util.Scanner;

public class MiddleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleCharacter(input);

    }
    public static void printMiddleCharacter (String text){

        if (text.length() % 2 == 1){
            int middleChar = text.length() / 2;

            System.out.println(text.charAt(middleChar) );


        }else {

            int middleChar = text.length() / 2;

            System.out.println(text.charAt(middleChar - 1) + "" + text.charAt(middleChar));

        }
    }
}

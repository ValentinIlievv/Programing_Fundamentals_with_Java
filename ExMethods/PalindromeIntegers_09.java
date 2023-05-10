package ExMethods;

import java.util.Scanner;

public class PalindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){


            if (isPolindromeInteger(input)){
                System.out.println("true");
            }else {
                System.out.println("false");
            }

            input = scanner.nextLine();
        }
    }
    public static boolean isPolindromeInteger (String num){
       String reversedString = "";

       for (int i = num.length() -1; i >= 0; i--){
            reversedString += num.charAt(i);


        }
        return num.equals(reversedString);
    }
}

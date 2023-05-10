package ExMethods;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        vowels(text.toLowerCase());


    }
    public static void vowels (String text){

        int count = 0;

        for (char symbol: text.toCharArray()) {

            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){

                count++;
            }
        }
        System.out.println(count);
    }
}

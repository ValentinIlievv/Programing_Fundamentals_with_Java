package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());


        String result = repeatText(text, n);

        System.out.println(result);


    }
    public static String repeatText (String text, int n){
        String fullText = "";

        for (int i = 1; i <= n ; i++) {
          fullText = fullText + text;
        }
        return fullText;
    }


}

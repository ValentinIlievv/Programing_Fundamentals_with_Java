package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        switch (type){
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondtNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getHigher(firstNum, secondtNum));
                break;

            case "char":
                char firstSymbol = scanner.nextLine().charAt(0);
                char secondSymbol = scanner.nextLine().charAt(0);
                System.out.println(getHigher(firstSymbol, secondSymbol));
                break;

            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getHigher(firstText, secondText));
                break;
        }
    }
    public static int getHigher (int firstNum, int secondNum ){

        if (firstNum > secondNum){
            return firstNum;
        }else {
            return secondNum;
        }

    }
    public static char getHigher (char firstSymbol, char secondSymbol){
        if (firstSymbol > secondSymbol){
            return firstSymbol;
        }else{
            return secondSymbol;
        }

    }
    public static String getHigher(String firstText, String secondText){
        if (firstText.compareTo(secondText) > 0){
            return firstText;

        }else {
            return secondText;
        }
    }
}

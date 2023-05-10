package Methods;

import java.util.Scanner;

public class MathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());


        switch (operator){
            case '*':
                System.out.println(multiply(firstNum, secondNum));
                break;

            case '/':
                System.out.println(divide(firstNum, secondNum));
                break;

            case '+':
                System.out.println(add(firstNum, secondNum));
                break;

            case '-':
                System.out.println(subtract(firstNum, secondNum));
                break;
        }
    }
    public static int multiply (int firstNum, int secondNum){
        return firstNum * secondNum;
    }
    public static int divide (int firstNum, int secondNum){
        return firstNum / secondNum;
    }
    public static int add (int firstNum, int secondNum){
        return firstNum + secondNum;
    }
    public static int subtract (int firstNum, int secondNum){
        return firstNum - secondNum;
    }

}

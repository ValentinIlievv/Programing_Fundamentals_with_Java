package Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operationIntup = scanner.nextLine();
        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        switch (operationIntup){
            case "add":
                addNum(firstNumInput, secondNumInput);
            break;

            case "multiply":
                multiplyNum(firstNumInput, secondNumInput);
                break;

            case "subtract":
                subtractNum(firstNumInput, secondNumInput);
                break;

            case "divide":
                divideNum(firstNumInput, secondNumInput);
                break;

        }




    }public static void addNum (int firstNum,int secondNum){

        System.out.println(firstNum + secondNum);

    }
    public static void multiplyNum (int firstNum,int secondNum){

        System.out.println(firstNum * secondNum);

    }
    public static void subtractNum (int firstNum,int secondNum){

        System.out.println(firstNum - secondNum);

    }
    public static void divideNum (int firstNum,int secondNum){

        System.out.println(firstNum / secondNum);

    }
}

package ExMethods;

import java.util.Scanner;

public class AddAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());


        int sum = sum(firstNum, secondNum);
        int result = subtract(sum, thirdNum);


        System.out.println(result);


    }
    public static int sum (int n1, int n2){
        return n1 + n2;
    }
    public static int subtract (int n1, int n2){

        return n1 - n2;
    }
}

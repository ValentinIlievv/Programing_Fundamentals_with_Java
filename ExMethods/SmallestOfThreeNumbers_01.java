package ExMethods;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int result = minNum(firstNum, secondNum, thirdNum);

        System.out.println(result);


    }
    public static int minNum (int n1, int n2, int n3){

        if (n1 < n2 && n1 < n3){
            return n1;
        }else if (n2 < n1 && n2 < n3){
            return n2;
        }else {
            return n3;
        }
    }
}

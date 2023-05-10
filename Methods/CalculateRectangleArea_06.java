package Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());


        System.out.println(area(firstNum, secondNum));







    }
    public static int area (int firstNum, int secondNum){
        int area = firstNum * secondNum;

        return area;
    }

}

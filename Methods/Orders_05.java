package Methods;

import java.util.Scanner;

public class Orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String productName = scanner.nextLine();
        double productQuantity = Integer.parseInt(scanner.nextLine());

        switch (productName) {
            case "coffee":
                coffee(productQuantity);
                break;

            case "water":
                water(productQuantity);
                break;

            case "coke":
                coke(productQuantity);
                break;

            case "snacks":
                snacks(productQuantity);
                break;
        }
    }

    public static void coffee(double num) {

        System.out.printf("%.2f", num * 1.5);
    }

    public static void water(double num) {

        System.out.printf("%.2f", num * 1.0);
    }

    public static void coke(double num) {
        System.out.printf("%.2f", num * 1.4);

    }

    public static void snacks(double num) {
        System.out.printf("%.2f", num * 2.0);

    }
}

package MidExam;

import java.util.Scanner;

public class BurgerBus_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCities = Integer.parseInt(scanner.nextLine());

        double totalProfit = 0;

        for (int city = 1; city <= numberOfCities; city++) {
            String cityName = scanner.nextLine();
            double income = Double.parseDouble(scanner.nextLine());
            double expenses = Double.parseDouble(scanner.nextLine());
            double profit = income - expenses;

            if (city % 15 == 0) {
                double rainLosses = income * 0.1;
                profit -= rainLosses;
                totalProfit += profit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
                break;
            } else if (city % 3 == 0) {
                double specialEventCosts = expenses * 0.5;
                profit -= specialEventCosts;
                totalProfit += profit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
            } else if (city % 5 == 0) {
                double rainLosses = income * 0.1;
                profit -= rainLosses;
                totalProfit += profit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
            } else {
                totalProfit += profit;
                System.out.printf("In %s Burger Bus earned %.2f leva.%n", cityName, profit);
            }
        }
        System.out.printf("Burger Bus total profit: %.2f leva.", totalProfit);
    }
}

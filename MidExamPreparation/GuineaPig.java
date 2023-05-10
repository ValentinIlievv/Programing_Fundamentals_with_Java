package MidExamPreparation;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQuantity = Double.parseDouble(scanner.nextLine());
        double hayQuantity = Double.parseDouble(scanner.nextLine());
        double coverQuantity = Double.parseDouble(scanner.nextLine());
        double guineaWeight = Double.parseDouble(scanner.nextLine());

        boolean isEnough = true;

        double foodInGr = foodQuantity * 1000;
        double hayInGr = hayQuantity * 1000;
        double coverInGr = coverQuantity * 1000;
        double guineaWeightInGr = guineaWeight * 1000;

        for (int i = 1; i <= 30; i++) {
            foodInGr -= 300;
            if (i % 2 == 0) {
                double restOfFood = foodInGr * 0.05;
                hayInGr -= restOfFood;
            }
            if (i % 3 == 0) {
                double coverPortion = guineaWeightInGr / 3;
                coverInGr -= coverPortion;
            }
            if (foodInGr <= 0 || hayInGr <= 0 || coverInGr <= 0) {
                System.out.println("Merry must go to the pet store!");
                isEnough = false;
                break;
            }
        }
        if (isEnough) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodInGr / 1000, hayInGr / 1000, coverInGr / 1000);
        }

    }
}

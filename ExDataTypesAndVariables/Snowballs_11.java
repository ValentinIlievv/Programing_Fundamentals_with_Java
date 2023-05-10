package ExDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballNumber = Integer.parseInt(scanner.nextLine());

        double highestValue = Double.MIN_VALUE;
        int quality = 0;
        int snow = 0;
        int time = 0;

        for (int i = 1; i <= snowballNumber ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            int divide = snowballSnow / snowballTime;
            double value = Math.pow(divide, snowballQuality);

            if (value > highestValue){
                highestValue = value;
                quality = snowballQuality;
                snow = snowballSnow;
                time = snowballTime;
            }

        }

        System.out.printf("%d : %d = %.0f (%d)",snow, time, highestValue, quality);
    }
}

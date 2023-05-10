package ExDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxVolumeKegName = "";

        for (int keg = 1; keg <= countKegs ; keg++) {

            String kegModel = scanner.nextLine();
            double kegRadius = Double.parseDouble(scanner.nextLine());
            int kegHeight = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(kegRadius, 2) * kegHeight;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxVolumeKegName = kegModel;
            }

        }
        System.out.println(maxVolumeKegName);


    }
}

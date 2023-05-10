package ExDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int currentLiters = 0;

        for (int i = 1; i <= n ; i++) {
            int pouredLitters = Integer.parseInt(scanner.nextLine());
            currentLiters += pouredLitters;

            if (currentLiters > capacity){
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLitters;
            }
        }

        System.out.println(currentLiters);
    }
}

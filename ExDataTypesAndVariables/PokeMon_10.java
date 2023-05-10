package ExDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());

        int pokes = 0;
        int firtsPower = power;


        while (power >= distance){

            power -= distance;
            pokes++;

            if (power == firtsPower / 2){
                if (factor != 0){
                    power /= factor;
                }
            }


        }

        System.out.println(power);
        System.out.println(pokes);


    }
}

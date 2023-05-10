package ExArrays;

import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonCount = Integer.parseInt(scanner.nextLine());

        int[] peopleCount = new int[wagonCount];
        int sum = 0;

        for (int i = 1; i <= wagonCount ; i++) {

            int peopleInput = Integer.parseInt(scanner.nextLine());

            peopleCount[i - 1] = peopleInput;

            sum += peopleInput;

        }
        for (int i = 0; i < peopleCount.length ; i++) {

            System.out.printf("%d ",peopleCount[i]);

        }
        System.out.printf("%n%d",sum);

    }
}

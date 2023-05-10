package List;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numList.size() - 1; i++) {
            double firstNum = numList.get(i);
            double secondNum = numList.get(i + 1);

            if (firstNum == secondNum) {
                numList.set(i, firstNum + secondNum);
                numList.remove(i + 1);
                i = -1;
            }

        }
        printList(numList);

    }
    public static void printList (List<Double> list){
        DecimalFormat df = new DecimalFormat("0.##");

        for (double index: list ) {

            System.out.print(df.format(index) + " ");
        }


    }
}

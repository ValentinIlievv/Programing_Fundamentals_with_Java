package List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int listSize = numList.size();

        for (int i = 0; i < listSize / 2 ; i++) {
            int firstNum = numList.get(i);
            int lastNum = numList.get(numList.size() - 1);

            numList.set(i, firstNum + lastNum);
            numList.remove(numList.size() - 1);

        }
        for (int index: numList) {

            System.out.print(index + " ");

        }
    }
}

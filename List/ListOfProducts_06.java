package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();
            inputList.add(i, product);
        }
        Collections.sort(inputList);

        for (int i = 0; i < inputList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, inputList.get(i));
        }
    }
}

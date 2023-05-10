package AssociativeArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numArr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> numsMap = new TreeMap<>();


        for (double element : numArr) {

            numsMap.putIfAbsent(element, 0);
            numsMap.put(element, numsMap.get(element) + 1 );

        }

        for (Map.Entry<Double, Integer> entry: numsMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}

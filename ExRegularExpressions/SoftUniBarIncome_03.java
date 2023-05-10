package ExRegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0;
        String regex = "%(?<name>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        //%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$
        Pattern pattern = Pattern.compile(regex);


        while (!input.equals("end of shift")) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customersName = matcher.group("name");
                String productName = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                totalSum += count * price;

                System.out.printf("%s: %s - %.2f%n", customersName, productName, price * count);
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}

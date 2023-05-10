package ExAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap <String, Double> productsPriceMap = new LinkedHashMap<>();
        LinkedHashMap <String, Double> productsQuantityMap = new LinkedHashMap<>();


        while (!input.contains("buy")){
            String[] inputArr = input.split(" ");
            String product = inputArr[0];
            Double price = Double.parseDouble(inputArr[1]);
            Double quantity = Double.parseDouble(inputArr[2]);

            if (!productsPriceMap.containsKey(product)){
                productsPriceMap.put(product, price);
                productsQuantityMap.put(product, quantity);
            }
            else {
                double oldPrice = productsPriceMap.get(product);
                double oldQuantity = productsQuantityMap.get(product);
                productsQuantityMap.put(product, quantity + oldQuantity);
                if (oldPrice != price){
                    productsPriceMap.put(product, price);
                }
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : productsPriceMap.entrySet()) {
            String productName = entry.getKey();

            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * productsQuantityMap.get(productName));
        }

    }
}

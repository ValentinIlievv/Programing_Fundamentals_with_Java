package ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int barcodesCount = Integer.parseInt(scanner.nextLine());

        String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern pattern = Pattern.compile(regex);

        String digitsRegex = "[0-9]";
        Pattern digitsPattern = Pattern.compile(digitsRegex);

        for (int i = 1; i <= barcodesCount ; i++) {
            String barcodes = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcodes);
            boolean isValid = false;

            while (matcher.find()){
                isValid = true;
                StringBuilder digits = new StringBuilder();
                Matcher digitsMatcher = digitsPattern.matcher(barcodes);
                boolean isContainDigit = false;

                while (digitsMatcher.find()) {
                    digits.append(digitsMatcher.group());
                    isContainDigit = true;
                }
                if (isContainDigit){
                    System.out.println("Product group: " + digits.toString());
                }
                else {
                    System.out.println("Product group: 00");
                }
            }
            if (!isValid){
                System.out.println("Invalid barcode");
            }



        }
    }
}

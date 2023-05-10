package ExamPreparation;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String command = input.split("\\s+")[0];
            switch (command) {
                case "TakeOdd":
                    StringBuilder takeOddSb = new StringBuilder();
                    takeOddSb = getOdds(takeOddSb, password);
                    password = takeOddSb.toString();
                    System.out.println(takeOddSb.toString());
                    break;
                case "Cut":
                    int index = Integer.parseInt(input.split("\\s+")[1]);
                    int lenght = Integer.parseInt(input.split("\\s+")[2]);
                    String cutPassword = password.substring(index, index + lenght);
                    password = password.replace(cutPassword, "");
                    System.out.println(password);


                    break;
                case "Substitute":
                    String substring = input.split("\\s+")[1];
                    String substitute = input.split("\\s+")[2];

                    if (password.contains(substring)) {
                        password = password.replaceAll(substring, substitute);
                        System.out.println(password);
                    } else {
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }


            input = scanner.nextLine();
        }
        System.out.println("Your password is: " + password);
    }

    private static StringBuilder getOdds(StringBuilder takeOddSb, String password) {

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (i % 2 != 0) {
                takeOddSb.append(symbol);
            }
        }
        return takeOddSb;
    }
}

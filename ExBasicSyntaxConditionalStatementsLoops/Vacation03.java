package ExBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Vacation03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double totalPrice = 0;

        if (typeOfGroup.equals("Students")){
            if (dayOfWeek.equals("Friday")){
                totalPrice = peopleCount * 8.45;
                if (peopleCount >= 30){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }

            }else if (dayOfWeek.equals("Saturday")){
                totalPrice = peopleCount * 9.8;
                if (peopleCount >= 30){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }

            }else if (dayOfWeek.equals("Sunday")){
                totalPrice = peopleCount * 10.46;
                if (peopleCount >= 30){
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }

            }

        }else if (typeOfGroup.equals("Business")){

            if (peopleCount >= 100){
                peopleCount = peopleCount - 10;
            }
            if (dayOfWeek.equals("Friday")){
                totalPrice = peopleCount * 10.9;

            }else if (dayOfWeek.equals("Saturday")){
                totalPrice = peopleCount * 15.6;

            }else if (dayOfWeek.equals("Sunday")){
                totalPrice = peopleCount * 16;

            }

        }else if (typeOfGroup.equals("Regular")){
            if (dayOfWeek.equals("Friday")){
                totalPrice = peopleCount * 15;
                if (peopleCount >= 10 && peopleCount <= 20){
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }

            }else if (dayOfWeek.equals("Saturday")){
                totalPrice = peopleCount * 20;
                if (peopleCount >= 10 && peopleCount <= 20){
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }

            }else if (dayOfWeek.equals("Sunday")){
                totalPrice = peopleCount * 22.5;
                if (peopleCount >= 10 && peopleCount <= 20){
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }

            }

        }

        System.out.printf("Total price: %.2f", totalPrice);



        }
    }


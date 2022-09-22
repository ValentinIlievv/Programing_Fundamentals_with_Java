package ExBasicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class PadawanEquipment10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        int freeBeltsCount = studentsCount / 6;


        double lightsaberTotalPrice = Math.ceil(studentsCount * 1.1) * lightsaberPrice ;
        double robesTotalPrice = studentsCount * robePrice;
        double beltsTotalPrice = (studentsCount - freeBeltsCount) * beltPrice;

        double totalPrice = lightsaberTotalPrice + robesTotalPrice + beltsTotalPrice ;



        if (amountMoney >= totalPrice){

            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else {
            double diff = Math.abs(amountMoney - totalPrice);
            System.out.printf("George Lucas will need %.2flv more.",diff);
        }


    }
}

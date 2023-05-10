package ExAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, String> registerMap = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String input = scanner.nextLine();
            String command = input.split("\\s+")[0];
            if (command.equals("register")){
               String username = input.split("\\s+")[1];
               String licenseNumber = input.split("\\s+")[2];
               if (!isExist(registerMap, username)){
                   registerMap.put(username, licenseNumber);
                   System.out.printf("%s registered %s successfully%n", username, licenseNumber);
               }
               else {
                   System.out.println("ERROR: already registered with plate number " + licenseNumber);
               }
            }
            else if (command.equals("unregister")){
                String username = input.split("\\s+")[1];

                if (isExist(registerMap, username)){
                    registerMap.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
                else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }


            }
        }

        for (Map.Entry<String, String> entry : registerMap.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
    private static boolean isExist (LinkedHashMap<String, String> map, String username){

        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (map.containsKey(username)){
                return true;
            }
        }
        return false;

    }
}

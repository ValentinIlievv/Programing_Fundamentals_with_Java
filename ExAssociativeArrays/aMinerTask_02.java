package ExAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class aMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int lineCounter = 1;
        String resource = "";
        boolean isExist = false;

        LinkedHashMap <String, Integer>  minerMap = new LinkedHashMap<>();

        while (!input.equals("stop")){

            if (minerMap.containsKey(input)){
                resource = input;
                isExist = true;
                lineCounter ++;
                input = scanner.nextLine();
                continue;
            }

            if (lineCounter % 2 == 0){
                int quantity = Integer.parseInt(input);
                if (isExist){
                    int existValue = minerMap.get(resource);
                    minerMap.put(resource, quantity + existValue);
                    lineCounter ++;
                    input = scanner.nextLine();
                    continue;
                }
                minerMap.put(resource, quantity);
            }else {
                resource = input;
                minerMap.put(resource, 0);
            }

             lineCounter ++;
            input = scanner.nextLine();
        }
        minerMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}

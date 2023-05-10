package ExAssociativeArrays;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> sidesMap = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){


            if (input.contains(" | ")){
                String side = input.split("\\s+\\|\\s+")[0] ;
                String user = input.split("\\s+\\|\\s+")[1] ;

                   if (!sidesMap.containsKey(side)){
                       sidesMap.put(side, new ArrayList<>());
                       sidesMap.get(side).add(user);
                   }
                   else {
                       boolean isExistUser = false;

                       for (List<String> usersList : sidesMap.values()) {

                           if (usersList.contains(user)){
                               isExistUser = true;
                               break;
                           }
                       }
                       if (!isExistUser){
                           sidesMap.get(side).add(user);
                       }
                   }


               }
               else if (input.contains(" -> ")){
                   String user = input.split("\\s+->\\s+")[0] ;
                   String side = input.split("\\s+->\\s+")[1] ;

                   sidesMap.entrySet().forEach(entry -> entry.getValue().remove(user));

                   if (sidesMap.containsKey(side)){
                       sidesMap.get(side).add(user);
                   }
                   else if (!sidesMap.containsKey(side)){
                       sidesMap.put(side, new ArrayList<>());
                       sidesMap.get(side).add(user);
                   }

                   System.out.printf("%s joins the %s side!%n",user, side);

               }
               input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : sidesMap.entrySet()) {

            List<String> usersList = entry.getValue();

            if (usersList.size() > 0) {
            System.out.printf("Side: %s, Members: %s%n", entry.getKey(), entry.getValue().size());

                usersList.forEach(user -> System.out.println("! " + user));
            }
        }

    }
}

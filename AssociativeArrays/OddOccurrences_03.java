package AssociativeArrays;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = (scanner.nextLine().split(" "));
        LinkedHashMap <String, Integer> countMap = new LinkedHashMap<>();

        for (String element: inputArr){
           element = element.toLowerCase();

            countMap.putIfAbsent(element, 0);
            countMap.put(element, countMap.get(element) + 1);
        }
        List <String> resultList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {

            if (entry.getValue() % 2 != 0 ){
               resultList.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", resultList));

    }
}

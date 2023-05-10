package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());


        int minSize = Math.min(firstList.size(),secondList.size());

        List<Integer> mergeList = new ArrayList<>();


        for (int i = 0; i < minSize; i++) {

            mergeList.add(firstList.get(i));
            mergeList.add(secondList.get(i));
        }

//            3 5 2 43 12 3 54 10 23 ,   3 76 5 5 2 34 43 2 12 4 3 12 54 10 23
//           76 5 34 2 4 12
          if (firstList.size() > secondList.size()) {
              mergeList.addAll(firstList.subList(minSize, firstList.size()));
          }else {
              mergeList.addAll(secondList.subList(minSize, secondList.size()));
          }

        for (int index: mergeList) {

            System.out.print(index + " ");

        }


    }
}

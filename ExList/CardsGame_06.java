package ExList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerHand = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayerHand = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        while (firstPlayerHand.size() != 0 && secondPlayerHand.size() != 0) {

            int i = 0;

            if (firstPlayerHand.get(i) > secondPlayerHand.get(i)) {
                int firstCard = firstPlayerHand.get(i);
                int secondCard = secondPlayerHand.get(i);
                firstPlayerHand.remove(i);
                secondPlayerHand.remove(i);
                firstPlayerHand.add(firstCard);
                firstPlayerHand.add(secondCard);
            } else if (secondPlayerHand.get(i) > firstPlayerHand.get(i)) {
                int firstCard = secondPlayerHand.get(i);
                int secondCard = firstPlayerHand.get(i);
                firstPlayerHand.remove(i);
                secondPlayerHand.remove(i);
                secondPlayerHand.add(firstCard);
                secondPlayerHand.add(secondCard);

            } else {
                firstPlayerHand.remove(i);
                secondPlayerHand.remove(i);
            }

            i++;
        }

        if (firstPlayerHand.size() == 0) {
            int sum = 0;

            for (int index = 0; index < secondPlayerHand.size(); index++) {
                sum += secondPlayerHand.get(index);
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        } else if (secondPlayerHand.size() == 0) {
            int sum = 0;

            for (int index = 0; index < firstPlayerHand.size(); index++) {
                sum += firstPlayerHand.get(index);
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }

    }
}

package TextProcessing;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWordsArr.length; i++) {
            String bannedWord = bannedWordsArr[i];
            String asterisksCount = "";
            for (int j = 0; j < bannedWord.length(); j++) {
                asterisksCount += "*";
            }
            int index = text.indexOf(bannedWord);

            while (index != -1) {

                text = text.replace(bannedWord, asterisksCount);

                index = text.indexOf(bannedWord);
            }

        }

        System.out.println(text);
    }
}

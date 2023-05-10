package ExTextProcessing;

import java.util.Scanner;

public class ExtractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split("\\\\");

        String[] fileArr = inputArr[inputArr.length - 1].split("\\.");
        String fileName = fileArr[0];
        String extensionName = fileArr[1];

        System.out.printf("File name: %s%n" +
                "File extension: %s", fileName, extensionName);
    }
}

package ExList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String commandInput = scanner.nextLine();

        while (!commandInput.equals("3:1")){

            if (commandInput.contains("merge")){
                int startIndex = Integer.parseInt(commandInput.split("\\s+")[1]);
                int endtIndex = Integer.parseInt(commandInput.split("\\s+")[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }
                if (endtIndex > inputList.size() - 1){
                    endtIndex = inputList.size() - 1;
                }
                boolean isValidIndex = startIndex <= inputList.size() - 1 && endtIndex >= 0 && startIndex < endtIndex;

                if (isValidIndex){
                    String mergeText = "";
                    for (int i = startIndex; i <= endtIndex ; i++) {
                        String currentText = inputList.get(i);
                        mergeText += currentText;
                    }
                    for (int i = startIndex; i <= endtIndex ; i++) {
                           inputList.remove(startIndex);
                    }
                    inputList.add(startIndex, mergeText);
                }

            }else if (commandInput.contains("divide")){
                int index = Integer.parseInt(commandInput.split(" ")[1]);
                int parts = Integer.parseInt(commandInput.split(" ")[2]);
                String elementForDivide = inputList.get(index);
                inputList.remove(index);



                int partSize = elementForDivide.length() / parts;

                int beginIndexOfText = 0;
                for (int part = 1; part < parts; part++) {
                    inputList.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));

                    index++;
                    beginIndexOfText += partSize;
                }

                inputList.add(index, elementForDivide.substring(beginIndexOfText));

            }




            commandInput = scanner.nextLine();
        }
        for (String element: inputList) {
            System.out.print(element + " ");

        }
    }
}

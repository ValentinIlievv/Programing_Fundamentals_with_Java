package ExAssociativeArrays;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        LinkedHashMap<String, List<String>> coursesMap = new LinkedHashMap<>();

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String student = input.split(" : ")[1];

            if (!coursesMap.containsKey(courseName)){
                coursesMap.put(courseName, new ArrayList<>());
                coursesMap.get(courseName).add(student);
            }
            else {
                coursesMap.get(courseName).add(student);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
        }

    }
}

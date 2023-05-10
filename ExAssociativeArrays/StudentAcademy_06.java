package ExAssociativeArrays;

import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap <String, List<Double>> studentsGradesMap = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String studentName = scanner.nextLine();
            Double studentGrade = Double.parseDouble(scanner.nextLine());

            if (!studentsGradesMap.containsKey(studentName)){
                studentsGradesMap.put(studentName, new ArrayList<>());
            }
            studentsGradesMap.get(studentName).add(studentGrade);
        }
        
        LinkedHashMap<String, Double> averageGradeMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsGradesMap.entrySet()) {
            List<Double> gradeList = entry.getValue();
            double averageGrade = getAverageValue(gradeList);

            if (averageGrade >= 4.50){
                averageGradeMap.put(entry.getKey(), averageGrade);
            }
        }


        averageGradeMap.entrySet().forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));


    }

    private static double getAverageValue(List<Double> gradeList) {
        double sum = 0;

        for (double grade: gradeList) {
             sum += grade;
        }
        return  sum / gradeList.size();
    }
}

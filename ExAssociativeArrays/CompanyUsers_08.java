package ExAssociativeArrays;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        LinkedHashMap<String, List<String>> employeesMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] inputArr = input.split(" -> ");
            String company = inputArr[0];
            String employeeId = inputArr[1];

            if (!isExistId(employeesMap, company, employeeId)) {
                employeesMap.putIfAbsent(company, new ArrayList<>());
                employeesMap.get(company).add(employeeId);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : employeesMap.entrySet()) {

            System.out.println(entry.getKey());
            entry.getValue().forEach(user -> System.out.println("-- " + user));
        }


    }

    private static boolean isExistId(LinkedHashMap<String, List<String>> employeeMap, String employeeCompany, String employeeId) {

        for (Map.Entry<String, List<String>> entry : employeeMap.entrySet()) {
            List<String> idList = entry.getValue();

            if (employeeCompany.equals(entry.getKey())) {
                for (String user : idList) {
                    if (user.equals(employeeId)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

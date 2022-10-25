package module11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//є список об'єктів робітників компаніі. перетворити його на список імен співробітників
public class StreamApiTest {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John Doe", 1500, Position.MANAGER),
                new Employee("Maryna L", 900, Position.PROGRAMMER),
                new Employee("Olegh I", 1000, Position.MANAGER),
                new Employee("Mikhail I", 1200, Position.MANAGER)
        );
//        List<String> names = convertEmployeeToNames(employees);
//        System.out.println("names = " + names);
//        String names = convertEmployeeToNamesString(employees);
//        System.out.println("names = " + names);

//        List<Integer> salary = convertEmployeeToSalaryOfManagers(employees);
//        System.out.println("salary = " + salary);


//        Double avgSalary = getAverageSalaryOfManagers(employees);
//        System.out.println("avgSalary = " + avgSalary);

//            List<Employee> max = getMaxSalary(employees);
//        System.out.println("max = " + max);

        // дано кілька рядків імен через комуб повернути список імен
        String [] names = {
                "Vasia Petia Olia",
                "Anton Masha"
        };
        List<String> res = Arrays.stream(names)
                .map(nameLine -> Arrays.asList(nameLine.split(" ")))
                .flatMap(l -> l.stream())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("res = " + res);

    }

    //є список об'єктів робітників компаніі. перетворити його на список імен співробітників
    public static List<String> convertEmployeeToNames(List<Employee> employeeList) {
        return employeeList.stream()
                .map((empl) -> empl.getFullName())
                .collect(Collectors.toList());

        //        List<String> names = new ArrayList<>();
//        for (Employee employee : employeeList) {
//            names.add(employee.getFullName());
//        }
//        Stream<Employee> employeeStream = employeeList.stream();
//        Function<Employee, String> function = (empl) -> empl.getFullName();
//        employeeStream
//                .map(function)
//                .collect(Collectors.toList());
//        return names;
    }

    //є список об'єктів робітників компаніі. перетворити його на рядок імен співробітників якы роздыляються комою
    public static String convertEmployeeToNamesString(List<Employee> employeeList) {
        return employeeList.stream()
                .map((empl) -> empl.getFullName())
                .collect(Collectors.joining(", "));
    }

    //є список об'єктів робітників компаніі. перетворити його на список зп менеджерів
    public static List<Integer> convertEmployeeToSalaryOfManagers(List<Employee> employeeList) {

        return employeeList.stream()
                .filter(employee -> Position.MANAGER.equals(employee.getPosition()))
                .map(employee -> employee.getSalary())
                .sorted((s1, s2) -> s2 - s1)
                .collect(Collectors.toList());



//        List<String> names = new ArrayList<>();
//        for (Employee employee : employeeList) {
//            if(Position.MANAGER.equals(employee.getPosition())){
//                names.add(employee.getFullName());
//            }
//        }
    }

    //є список об'єктів робітників компаніі. знайти середню зп менеджерів
    public static Double getAverageSalaryOfManagers(List<Employee> employeeList) {

        return employeeList.stream()
                .filter(employee -> Position.MANAGER.equals(employee.getPosition()))
                .mapToInt(employee -> employee.getSalary())
                .average()
                .getAsDouble();

    }

    // знайти робітника з найбільшою зп
    public static List<Employee> getMaxSalary(List<Employee> employeeList) {

        return employeeList.stream()
                .sorted((empl1, empl2) -> empl2.getSalary() - empl1.getSalary())
                .limit(1)
                .collect(Collectors.toList());

    }
}

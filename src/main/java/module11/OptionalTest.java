package module11;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        Optional<Employee> employeeOpt = employeeService.findEmployeeByFullName("John1 Doe");
//        if(employeeOpt.isPresent()){
//            Employee employee = employeeOpt.get();
//            /// logic for employee
//        }

//        employeeOpt.ifPresentOrElse(
//                (item) -> System.out.println(item),
//                () -> System.out.println("Employee not found")
//        );

//        Employee employee = employeeOpt.orElseGet(() -> new Employee("default", 0, Position.MANAGER, 0));
//        System.out.println("employee = " + employee);


    }
}

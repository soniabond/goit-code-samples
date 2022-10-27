package module11;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class EmployeeService {

    private Set<Employee> employees = Set.of(
            new Employee("John Doe", 1500, Position.MANAGER, 10),
            new Employee("Maryna L", 900, Position.PROGRAMMER, 1),
            new Employee("Olegh I", 1000, Position.MANAGER, 4),
            new Employee("Mikhail I", 1200, Position.MANAGER, 6)
    );

    public Optional<Employee> findEmployeeByFullName(String fullName) {
        for (Employee employee : employees) {
            if(employee.getFullName().equals(fullName))
                return Optional.of(employee);
        }
        return Optional.empty();
    }
}

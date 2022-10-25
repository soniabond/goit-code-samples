package module11;

public class Employee {

    private final String fullName;
    private final Integer salary;

    private final Position position;

    public Employee(String fullName, Integer salary, Position position) {
        this.fullName = fullName;
        this.salary = salary;
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }
}

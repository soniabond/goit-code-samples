package module11;

public class Employee {

    private final String fullName;
    private final Integer salary;

    private final Position position;

    private final Integer workExp;

    private boolean hasBonus;

    public Employee(String fullName, Integer salary, Position position, Integer workExp) {
        this.fullName = fullName;
        this.salary = salary;
        this.position = position;
        this.workExp = workExp;
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

    public Integer getWorkExp() {
        return workExp;
    }

    public boolean isHasBonus() {
        return hasBonus;
    }

    public void setHasBonus(boolean hasBonus) {
        this.hasBonus = hasBonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                ", workExp=" + workExp +
                ", hasBonus=" + hasBonus +
                '}';
    }
}

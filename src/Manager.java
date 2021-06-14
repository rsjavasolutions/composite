import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, Integer emmpId, Long salary) {
        super(name, emmpId, salary);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return String.format("Developer: %s, %s, ... %s", super.getName(), super.getEmmpId(), employees);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lead extends Employee {

    private List<Employee> employees = new ArrayList<>();

    public Lead(String name, Integer emmpId, Long salary) {
        super(name, emmpId, salary);
    }

    @Override
    public void add(Employee employee){
        employees.add(employee);
    }

    @Override
    public void remove(Employee employee){
        employees.remove(employee);
    }

    @Override
    public String toString() {
        return  String.format("Lead: %s, %s, ... %s", super.getName(), super.getEmmpId(), employees);
    }
}

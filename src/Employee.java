public abstract class Employee {
    private String name;
    private Integer emmpId;
    private Long salary;

    public Employee(String name, Integer emmpId, Long salary) {
        this.name = name;
        this.emmpId = emmpId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getEmmpId() {
        return emmpId;
    }

    public Long getSalary() {
        return salary;
    }

    public void add(Employee employee) {
        throw new UnsupportedOperationException("Can't remove reportee by default");
    }

    public void remove(Employee employee) {
        throw new UnsupportedOperationException("Can't remove reportee by default");
    }
}

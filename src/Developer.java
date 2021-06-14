public class Developer extends Employee {

    public Developer(String name, Integer emmpId, Long salary) {
        super(name, emmpId, salary);
    }

    @Override
    public String toString() {
        return String.format("Developer: %s, %s", super.getName(), super.getEmmpId());
    }
}

package w6_skill;

public class EmployeeComparable implements Comparable<Employee> {
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.getId(), other.getId());
    }
}
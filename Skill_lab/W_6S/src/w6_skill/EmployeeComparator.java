package w6_skill;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        // Compare employees based on their salaries in descending order
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}
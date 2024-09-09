package w6_skill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Final {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "John", 5000.0));
        employees.add(new Employee(2, "Alice", 6000.0));
        employees.add(new Employee(3, "Bob", 4000.0));

        // Sort employees using Comparable interface
        Collections.sort(employees);
        System.out.println("Sorted by ID (Comparable):");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (ID: " + employee.getId() + ")");
        }

        // Sort employees using Comparator interface
        Collections.sort(employees, new EmployeeComparator());
        System.out.println("Sorted by Salary (Comparator):");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " (Salary: " + employee.getSalary() + ")");
        }

        // Clone an employee
        Employee clonedEmployee = employees.get(0).clone();
        System.out.println("Cloned Employee: " + clonedEmployee.getName() + " (ID: " + clonedEmployee.getId() + ")");

        // Iterate over employees
        for (Employee employee : employees) {
            System.out.println("Iterated Employee: " + employee.getName() + " (ID: " + employee.getId() + ")");
        }
    }
}

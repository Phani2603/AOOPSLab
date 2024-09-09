package w8_skill;

import java.util.*;

public class Final {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("DAta (id, name, salary):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            int id = scanner.nextInt();
            String name = scanner.next();
            double salary = scanner.nextDouble();
            employees.add(new Employee(id, name, salary));
        }

        // Filter employees with salary > 5000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() > 5000)
                .collect(Collectors.toList());
        System.out.println("Employees with salary > 5000:");
        highSalaryEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

        // Sort employees by salary in descending order
        List<Employee> sortedEmployees = employees.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList());
        System.out.println("Employees sorted by salary in descending order:");
        sortedEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));

        // Find the highest salary
        double highestSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0);
        System.out.println("Highest salary: " + highestSalary);

        // Calculate the average salary
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Average salary: " + averageSalary);
    }
}

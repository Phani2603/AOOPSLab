package SRP;

import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        while (true) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee role (Manager, Developer, Tester): ");
            String role = scanner.nextLine();

            Employee employee = new Employee(name, role);
            double salary = salaryCalculator.calculateSalary(employee);

            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Role: " + employee.getRole());
            System.out.println("Salary: $" + salary);

            System.out.print("Do you want to add another employee? (y/n): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
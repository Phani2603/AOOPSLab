package SRP;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double salary = 0;
        switch (employee.getRole()) {
            case "Manager":
                salary = 50000;
                break;
            case "Developer":
                salary = 40000;
                break;
            case "Tester":
                salary = 30000;
                break;
            default:
                salary = 20000;
                break;
        }
        return salary;
    }
}
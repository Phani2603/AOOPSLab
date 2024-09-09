package w6_skill;

import java.util.*;

public class Employee implements Cloneable, Iterable<Employee> {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator(this);
    }

    private static class EmployeeIterator implements Iterator<Employee> {
        private Employee current;

        public EmployeeIterator(Employee employee) {
            this.current = employee;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Employee next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Employee temp = current;
            current = null; // to avoid infinite loop
            return temp;
        }
    }
}

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "}";
    }
}

public class EmployeeDataProcessing {
    public static Map<String, Double> processEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(e -> "Engineering".equals(e.department) && e.salary > 80000)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.groupingBy(e -> e.department,
                        Collectors.averagingDouble(Employee::getSalary)));
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Sud", "Engineering", 90000),
                new Employee(2, "Nikh", "Engineering", 85000),
                new Employee(3, "raj", "HR", 70000)
        );
        Map<String, Double> result = processEmployees(employees);
        System.out.println("Average salary by department: " + result);
    }
}

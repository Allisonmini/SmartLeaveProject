package Company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sample role lists for employees
        List<String> role1 = Arrays.asList("Approver", "Processor");
        List<String> role2 = Arrays.asList("Viewer");
        List<String> role3 = Arrays.asList("Processor");
        List<String> role4 = Arrays.asList("Approver");

        // Create employee objects
        Employee emp1 = new Employee("101", "Alice", role1, 5);
        Employee emp2 = new Employee("102", "Bob", role2, 2);
        Employee emp3 = new Employee("103", "Carlos", role3, 3);
        Employee emp4 = new Employee("104", "Diana", role4, 1);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4);

        // Save to file
        Employee.saveToFile(employees);

        // Load from file and print
        List<Employee> loadedEmployees = Employee.loadFromFile();
        for (Employee emp : loadedEmployees) {
            System.out.println(emp);
            if (emp.hasRoleConflict()) {
                System.out.println("  -> SoD Conflict Detected!");
            }
        }
    }
}

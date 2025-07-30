package Company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee implements Serializable {
    public String id;
    public String name;
    public List<String> roles;
    private int leaveBalance;
    private static final String FILE_NAME = "employees.txt";

    public Employee(String id, String name, List<String> roles, int leaveBalance) {
        this.id = id;
        this.name = name;
        this.roles = roles;
        this.leaveBalance = leaveBalance;
    }

    public boolean hasRoleConflict() {
        return roles.contains("Approver") && roles.contains("Processor");
    }

    public String toCSV() {
        return id + "," + name + "," + String.join("|", roles) + "," + leaveBalance;
    }

    public static void saveToFile(List<Employee> employees) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Employee emp : employees) {
                writer.write(emp.toCSV());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> loadFromFile() {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String id = parts[0];
                String name = parts[1];
                List<String> roles = Arrays.asList(parts[2].split("\\|"));
                int leaveBalance = Integer.parseInt(parts[3]);
                employees.add(new Employee(id, name, roles, leaveBalance));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Roles: " + roles + ", Leave Balance: " + leaveBalance;
    }
}

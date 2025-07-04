package Company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> role1 = Arrays.asList("Approver", "Processor");
        List<String> role2 = Arrays.asList("Viewer");
        List<String> role3 = Arrays.asList("Processor");
        List<String> role4 = Arrays.asList("Approver");

        Employee emp1 = new Employee(101,"Alice", role1, 5);
        Employee emp2 = new Employee(102, "Bob", role2, 2);
        Employee emp3 = new Employee(103, "Carlos", role3, 3);
        Employee emp4 = new Employee(104, "Diana", role4, 1);

        List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4);

        for (Employee emp : employees){
            System.out.println(emp);
        }

        for (Employee emp : employees){
            if (emp.hasSoDConflict()){
                System.out.println("SoD Conflict: " + emp.getName() + " has conflicting roles (Approver & Processor)");
            }
            else {
                System.out.println(emp.getName() + " has no SoD conflict.");
            }
        }

        LeaveRequest leave1 = new LeaveRequest(emp1.getId(), LocalDate.of(2025,6,16), LocalDate.of(2030, 6, 16), "Vacation", 1, false);
        LeaveRequest leave2 = new LeaveRequest(emp2.getId(), LocalDate.of(2024, 6, 16), LocalDate.of(2024, 6, 16), "Sick", 2, true);

        List<LeaveRequest> leavesList = new ArrayList<>();
        leavesList.add(leave1);
        leavesList.add(leave2);

        for (LeaveRequest lr : leavesList){
            System.out.println(lr);
        }

        // Check LeaveRequests
        for (LeaveRequest lr : leavesList) {
            if (lr.getEmployeeId() == emp1.getId()){
                lr.approveLeave(emp1);
            } else if (lr.getEmployeeId() == emp2.getId()){
                lr.approveLeave(emp2);
            }
        }

        System.out.println("\nLeave Requests:");
        for (LeaveRequest lr : leavesList){
            System.out.println(lr);
        }

        System.out.println("\nUpdated Employee Info: ");
        System.out.println(emp1);
        System.out.println(emp2);
    }
}

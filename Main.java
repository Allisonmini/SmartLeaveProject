package Company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Employee emp1= new Employee(101,"Alice", "Approver", 5);
        Employee emp2 = new Employee(102, "Bob", "Processor", 0);

        //Print Employee info
        System.out.println(emp1);
        System.out.println(emp2);

        LeaveRequest leave1= new LeaveRequest(emp1.getId(), LocalDate.of(2025,6,16), LocalDate.of(2030, 6, 16), "Vacation", 1, false);
        LeaveRequest leave2= new LeaveRequest(emp2.getId(), LocalDate.of(2024, 6, 16), LocalDate.of(2024, 6, 16), "Sick", 2, true);

        List<LeaveRequest> leavesList = new ArrayList<>();
        leavesList.add(leave1);
        leavesList.add(leave2);

        for (LeaveRequest lr: leavesList){
            System.out.println(lr);
        }

        // Check LeaveRequests
        for (LeaveRequest lr: leavesList) {
            if (lr.getEmployeeId() == emp1.getId()){
                lr.approveLeave(emp1);
            }
            else if (lr.getEmployeeId() == emp2.getId()){
                lr.approveLeave(emp2);
            }
        }

        System.out.println("\nLeave Requests:");
        for (LeaveRequest lr: leavesList){
            System.out.println(lr);
        }

        System.out.println("\nUpdated Employee Info: ");
        System.out.println(emp1);
        System.out.println(emp2);

    }
}

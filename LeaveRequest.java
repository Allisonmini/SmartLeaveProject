package Company;

import java.time.LocalDate;

public class LeaveRequest {
    private int employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;
    private int daysRequested;
    private boolean approved;

    public LeaveRequest(int employeeId, LocalDate startDate, LocalDate endDate, String type, int daysRequested, boolean approved) {
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.daysRequested = daysRequested;
        this.approved = approved;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDaysRequested() {
        return daysRequested;
    }

    public void setDaysRequested(int daysRequested) {
        this.daysRequested = daysRequested;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "LeaveRequest{" +
                "employeeId=" + employeeId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", type='" + type + '\'' +
                ", daysRequested=" + daysRequested +
                ", approved=" + approved +
                '}';
    }

    public void approveLeave(Employee employee){
        if (employee.hasSoDConflict()) {
            System.out.println("Approval denied due to SoD conflict for " + employee.getName());
            return;
        }
        if (employee.getLeaveBalance() >= daysRequested){
            approved = true;
            employee.deductLeave(daysRequested);
            System.out.println("Leave approved.");
        }
        else {
            System.out.println("Insufficient leave balance.");
        }
    }
}

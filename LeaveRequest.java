package Company;

import java.time.LocalDate;

public class LeaveRequest {
    private String employeeId;
    private LocalDate startDate;
    private LocalDate endDate;
    private String type;
    private int daysRequested;
    private boolean approved;

    public LeaveRequest(String employeeId, LocalDate startDate, LocalDate endDate, String type, int daysRequested, boolean approved) {
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.daysRequested = daysRequested;
        this.approved = approved;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getType() {
        return type;
    }

    public int getDaysRequested() {
        return daysRequested;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return "Leave Request [Employee ID: " + employeeId + ", Type: " + type + ", From: " + startDate +
                " to " + endDate + ", Days: " + daysRequested + ", Approved: " + approved + "]";
    }
}

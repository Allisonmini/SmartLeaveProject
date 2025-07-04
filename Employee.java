package Company;

import java.util.List;

public class Employee {
    public int id;
    public String name;
    public List<String> roles;
    private int leaveBalance;

    public Employee(int id, String name, List<String> roles, int leaveBalance){
        this.id = id;
        this.name = name;
        this.roles = roles;
        this.leaveBalance = leaveBalance;
    }

    public int getId() { return id; }

    public String getName() { return name; }

    public List<String> getRoles() { return roles; }

    public int getLeaveBalance() { return leaveBalance; }

    public void setName(String name){
        this.name = name;
    }

    public void setRole(List<String> role){
        this.roles = role;
    }

    public void setLeaveBalance(int leaveBalance){
        this.leaveBalance = leaveBalance;
    }

    public void deductLeave(int days){
        this.leaveBalance -= days;
    }

    public boolean hasRoles(String role){
        return roles != null && roles.contains(role);
    }

    public boolean hasSoDConflict(){
        return hasRoles("Processor") && hasRoles("Approver");
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + roles + '\'' +
                ", leaveBalance=" + leaveBalance +
                '}';
    }
}

package Company;

public class Employee {
    public int id;
    public String name;
    public String role;
    private int leaveBalance;

    public Employee(int id, String name, String role, int leaveBalance){
        this.id = id;
        this.name = name;
        this.role = role;
        this.leaveBalance = leaveBalance;
    }
    public int getId() {return id;}
    public String getName() {return name;}
    public String getRole() {return role;}
    public int getLeaveBalance(){ return leaveBalance;}

    public void setName(String name){
       this.name = name;
    }

    public void setRole (String role){
        this.role = role;
    }

    public void setLeaveBalance(int leaveBalance){
        this.leaveBalance= leaveBalance;
    }

    public void deductLeave(int days){
        this.leaveBalance -= days;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", leaveBalance=" + leaveBalance +
                '}';
    }
}

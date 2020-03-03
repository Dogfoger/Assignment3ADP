package trainor.sean;

public class Job {

    private String duties;
    private int wage;
    private int employeeID;

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getDuties() {
        return duties;
    }

    public int getWage() {
        return wage;
    }

    public int getEmployeeID() {
        return employeeID;
    }
}

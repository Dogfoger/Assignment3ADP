package trainor.sean;

public class Employee {

    //Composition alternative to inheritance proof
    private Job job;

    public Employee() {
        this.job = new Job();
        job.setWage(1000);
    }

    public int getWage() {
        return job.getWage();
    }
}

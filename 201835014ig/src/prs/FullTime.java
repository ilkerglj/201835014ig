package prs;


public class FullTime extends prs.Employee {
    private double salary;
    private double overtime;


    public FullTime(int id, String name, double sal, double hourAndHalf, prs.Vehicle vehicle)
    {
        super(id, name, vehicle);
        this.overtime = hourAndHalf;
        this.salary = sal;
    }


    public double calculatePay() {
        System.out.println("Full time employee");
        return (this.getSalary() + this.getOvertime());
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getOvertime() {
        return overtime;
    }


    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

}
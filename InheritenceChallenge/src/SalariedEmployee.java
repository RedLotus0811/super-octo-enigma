public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired = false;

    public SalariedEmployee() {
        super();
        this.annualSalary = 200000;
    }

    public SalariedEmployee(double annualSalary, boolean isRetired) {
        this();
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        super.terminate("12/09/22");
        this.isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }

    @Override
    public double collectPay() {
        return this.annualSalary;
    }
}

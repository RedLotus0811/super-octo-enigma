public class Employee extends Worker{

    private long employeeId;
    private String hireDate;

    public Employee() {
        super();

    }
    public Employee(long employeeId, String hireDate) {
        super();
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.birthDate = birthDate;
        this.endDate = endDate;
        this.name = name;
    }

    public Worker(String name, String birthDate) {
        this(name, birthDate, null);
    }

    public Worker() {
        this.name = null;
        this.endDate= null;
        this.birthDate = null;
    }

    public int getAge() {
        return  2023 - Integer.parseInt(birthDate);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

}

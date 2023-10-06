public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public Customer() {
        this("Person", 0.0, "32e2q1e@service.acme.corp");
    }

    public Customer(String name, double amt, String mail) {
        this.name = name;
        this.creditLimit = amt;
        this.email = mail;
    }

    public Customer(String name, String email) {
        this(name, 0.0, email);
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}

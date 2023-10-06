public class BankAccount {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phone;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid amount!");
            return;
        }
        this.balance += amount;
        System.out.println("You've successfully added "+ amount + " current balance is "+ getBalance());
    }

    public void withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("Amount exceeds balance!");
            return;
        }

        if(amount < 0) {
            System.out.println("Invalid amount!");
            return;
        }

        this.balance -= amount;
        System.out.println("You've just withdrawn "+ amount + " current balance: " + getBalance());
    }
}

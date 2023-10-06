public class Main {
    public static void main(String[] args) {
        BankAccount myaccount = new BankAccount();
        myaccount.setBalance(1000);
        myaccount.setName("ril");
        myaccount.setAccountNumber("234r232324");

        myaccount.deposit(2300);
        myaccount.withdraw(12200);

    }
}

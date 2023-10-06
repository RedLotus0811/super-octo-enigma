public class Main {
    public static void main(String[] args) {
        Customer mycustomer = new Customer();
        Customer myc2 = new Customer("ril", "everil@acme.corp");
        Customer myc3 = new Customer("everil", 2342.45, "everil@@efde.com");
        System.out.println(mycustomer);
        System.out.println(myc2);
        System.out.println(myc3);
    }
}

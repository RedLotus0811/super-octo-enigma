public class InheritenceChallenge {
    public static void main(String[] args) {
        SalariedEmployee emp = new SalariedEmployee();
        System.out.println(emp);
        System.out.println("Retiring...");
        System.out.println(emp.getAge());
        emp.retire();
        System.out.println(emp);
    }
}

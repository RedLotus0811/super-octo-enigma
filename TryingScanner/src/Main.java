import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(getInputFromScanner());
    }

    public static String getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = scanner.nextLine();
        System.out.println("Enter y.o.b : ");
        String year = scanner.nextLine();
        int age = 2023 - Integer.parseInt(year);
        return  name + " is " + age + " years old. ";
    }
}

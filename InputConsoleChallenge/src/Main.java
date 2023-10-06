import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        do {
            int index = 0;
            try {
                index = i + 1;
                System.out.println("Enter number " + index + " : ");
                String curr = scanner.nextLine();
                sum += Integer.parseInt(curr);
                i++;
            } catch (NumberFormatException badInput) {
                i = index - 1;
                System.out.println("Invalid Character");
            }
        }while ( i <= 4);
        System.out.println("Sum is : "+ sum);
    }


}

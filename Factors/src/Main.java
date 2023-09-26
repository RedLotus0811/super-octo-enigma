public class Main {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        if (number < 1) System.out.println("Invalid Number");

        int i = 1;
        while (i <= number) {
            boolean isFactor = number % i == 0;
            if(isFactor) System.out.println(i);
            i++;
        }
    }
}

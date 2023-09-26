public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; count < 3 &&  i <= 1000; i++) {
            boolean isPrime = isPrime(i);
            if (!isPrime) {
                System.out.println(i + " is not prime.");
                continue;
            }
            count++;
            System.out.println(i + " is prime");
            if (count == 3) break;
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 2) {
            return number == 2;
        }
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) return false;
        }
        return true;
    }
}

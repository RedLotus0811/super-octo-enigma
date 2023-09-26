public class Main {
    public static void main(String[] args) {
        System.out.println("6 is perfect ? : " + isPerfectNumber(6));
        System.out.println("28 ? : " + isPerfectNumber(26));
        System.out.println("5 ? : " + isPerfectNumber(5));
    }

    public static boolean isPerfectNumber(int number) {
        if(number < 1) return false;

        int i = 1;
        int sum = 0;
        while(i < number) {
            boolean isEvenlyDivisible = number % i == 0;
            if(isEvenlyDivisible) {
                sum += i;
            }
            i++;
        }

        return sum == number;
    }
}

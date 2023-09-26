public class DigitSum {
    public static void main(String[] args) {
        System.out.println("465 = " + sumDigits(465));
        System.out.println("125 = " + sumDigits(125));
        System.out.println("1 = " + sumDigits(1));
    }

    public static int sumDigits(int number) {
        if(number < 0) return -1;
        int sum = 0;
        do {
            int digit = number % 10;
            System.out.println("Number is : "+ number);
            System.out.println("Sum is : "+ sum);
            sum = sum + digit;
            number /= 10;
        } while (number != 0) ;
        return sum;
    }
}

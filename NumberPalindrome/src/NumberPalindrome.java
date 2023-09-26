public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println("175 is : " + isPalindrome(175));
        System.out.println(" 55 is "+ isPalindrome(55));
        System.out.println("11212 is " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverse = 0;
        int cpy = number;
        do {
            int lastDigit = (cpy % 10);
            reverse *= 10;
            reverse += lastDigit;
            cpy /= 10;

        }while (cpy > 0);
    return number == reverse;
    }
}

public class LeapYear {
    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) return false;

        boolean isEvenlyDivisibleByFour = isEvenlyDivisible(year, 4);
        boolean isEvenlyDivisibleByHundred = isEvenlyDivisible(year, 100);
        boolean isEvenlyDivisibleByFourHundred = isEvenlyDivisible(year, 400);

        if(isEvenlyDivisibleByFour && isEvenlyDivisibleByHundred && isEvenlyDivisibleByFourHundred) return true;

        return isEvenlyDivisibleByFour && !isEvenlyDivisibleByHundred;
    }

    public static boolean isEvenlyDivisible(int dividend, int divisor) {
        return (dividend % divisor) == 0;
    }
}

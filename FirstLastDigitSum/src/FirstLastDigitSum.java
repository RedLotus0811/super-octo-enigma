public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(" 1667 = " + sumFirstAndLastDigit(1667));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int first = firstDigit(number);
        int last = lastDigit(number);
        return first + last;
    }

    public static int firstDigit(int x) {
        int abs = Math.abs(x);
        while (abs > 9) {
            abs = abs/10;
        }
        return abs;
    }

    public static int lastDigit(int x) {
        int abs = Math.abs(x);
        return abs % 10;
    }

}

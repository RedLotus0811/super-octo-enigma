public class SharedDigit {
    public static void main(String[] args) {
//        System.out.println("Has shared digit _ 12, 23 : " + hasSharedDigit(12,23));
        System.out.println("Has shared digit _ 25, 42 : " + hasSharedDigit(25, 42));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99) return hasSharedDigit();
        if (num2 < 10 || num2 > 99) return hasSharedDigit();

        int num2cpy = num2;
        while (num1 > 0) {
            int digit = num1 % 10;

            num2 = num2cpy;
            while (num2 > 0) {
                int curr = num2 % 10;
                if (digit == curr) return true;
                num2 /= 10;
            }

            num1 /= 10;
        }
        return false;
    }

    public static boolean hasSharedDigit() {
        return false;
    }
}

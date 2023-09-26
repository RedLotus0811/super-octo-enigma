public class Main {
    public static void main(String[] args) {
        System.out.println(" lcf of 25, 15 : "+ getGreatestCommonDivisor(25,15));
        System.out.println(" lcf of 12 , 30 : "+ getGreatestCommonDivisor(12,30));
        System.out.println("lcf of 9, 18 : " + getGreatestCommonDivisor(9,18));
        System.out.println("lcf of 81, 153: " + getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int num1, int num2) {
        if (num1 < 10 || num2 < 10) return getGreatestCommonDivisor();

        int largest = Math.max(num1, num2);
        int i = 1;

        int largestCommonFactor = 0;

        while (i <= largest) {
            boolean isFactorToBoth = (num1 % i == 0) && (num2 % i == 0);
            if (isFactorToBoth) {
                if (!(largestCommonFactor > i)) largestCommonFactor = i;
            }
            i++;
        }

        return largestCommonFactor;
    }

    public static int getGreatestCommonDivisor() {
        return -1;
    }
}

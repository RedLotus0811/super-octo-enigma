public class TeenNumberChecker {
    public static void main(String[] args) {

    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean num1isTeen = isTeen(num1);
        boolean num2isTeen = isTeen(num2);
        boolean num3isTeen = isTeen(num3);

        return  num1isTeen || num2isTeen || num3isTeen;
    }

    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }
}

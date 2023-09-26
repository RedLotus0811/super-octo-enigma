public class DecimalComparator {
    public static void main(String[] args) {
        boolean tesxt = areEqualByThreeDecimalPlaces(3.1756,3.1757);
        System.out.println("test: " + tesxt);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {

        if((num1 > 0 && num2 < 0) || (num1 <0 && num2 >0)) return false;

        double firstShiftedByThousand = num1 * 1000;
        double secondShiftedByThousand = num2 * 1000;

        return  ((int) firstShiftedByThousand - (int) secondShiftedByThousand == 0);

    }


}

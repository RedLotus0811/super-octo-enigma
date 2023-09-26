public class ToCentiMeters {
    public static void main(String[] args) {
        System.out.println("24 inches is : "+ convertToCentimeters(24));
        System.out.println("12 feet and 24 inches is : "+ convertToCentimeters(12,24));
    }

    public static double convertToCentimeters(int inches) {
        return (double) (inches * 2.54);
    }

    public static double convertToCentimeters(int feet, int inches) {
        double inchesToCentimeters = convertToCentimeters(inches);
        double feetToCm = 12 * feet * 2.54;
        return  (feetToCm + inchesToCentimeters);
    }
}

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int years = (int) ((minutes / (24*60)) / 365);
        int remainingMinutes = (int) minutes % (24 * 60 * 365);
        int remainingDays = remainingMinutes  / ( 24 * 60);
        System.out.println(minutes + " min" + " = " + years + " y and " +  remainingDays + " d ");
    }
}

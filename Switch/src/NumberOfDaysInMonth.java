public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println("1600 is " + isLeapYear(1600));
        System.out.println("2017 is " + isLeapYear(2017));

        System.out.println("-1600 is " + isLeapYear(-1600));

    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) return isLeapYear();

        boolean divisibleByFour = year % 4 == 0;
        boolean divisibleByHundred = year % 100 == 0;
        boolean divisibleByFourHundred = year % 400 == 0;

        return (divisibleByFour && !divisibleByHundred) || divisibleByFourHundred;
    }

    public static boolean isLeapYear() {
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return getDaysInMonth();
        if (year < 1 || year > 9999) return getDaysInMonth();

        if (isLeapYear(year) && month == 2) return 29;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                return 28;
            }

            default -> {
                return 30;
            }
        }
    }

    public static int getDaysInMonth() {
        return -1;
    }
}

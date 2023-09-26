public class ModernSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++) {
            printDayOfWeek(i);
        }
    }

    public static void printDayOfWeek(int day) {
        String correspondingDay = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2  -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> {
                yield day + " is a bad input";
            }
        };
        System.out.println("Day " + day + " of the week is " + correspondingDay);
    }
}

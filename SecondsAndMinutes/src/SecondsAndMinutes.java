public class SecondsAndMinutes {
    public static void main(String[] args) {
        System.out.println("8274s is : " + getDurationString(8274));
        System.out.println("192 min and 25s is : " + getDurationString(192, 25));
        System.out.println("Invalid Params : " + getDurationString(-59, 456));
    }

    public static String getDurationString() {
        return "Invalid parameter encountered!. Please make sure seconds are less than 59 and minutes are positive !";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return getDurationString();
        }

        double toHours = (double) seconds / 3600;
        int hours = (int) toHours;
        double remainingMinutes = (toHours - hours) * 60;
        int minutes = (int) remainingMinutes;
        double remainingSeconds = (remainingMinutes - minutes) * 60;
        int second = (int) remainingSeconds;
        return hours + " hh " + minutes + " mm " + second + " ss";
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds > 59 || seconds < 0) {
            return getDurationString();
        }

        int converted = (minutes * 60) + seconds;
        return getDurationString(converted);
    }
}

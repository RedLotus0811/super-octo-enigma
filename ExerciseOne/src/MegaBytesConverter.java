public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kilobytes) {
        if (kilobytes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int remainingMegaBytes = kilobytes / 1024 ;
        int remainingKiloBytes = kilobytes % 1024;

        System.out.println(kilobytes+ " KB = " + remainingMegaBytes + " MB and " + remainingKiloBytes + " KB");
    }
}

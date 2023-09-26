public class Main {
    public static void main(String[] args) {
        int num = 5;

        while (num != 20) {
            if(isEvenNumber(num)) {
                System.out.println("Found an even number: " + num);
            }
            num++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

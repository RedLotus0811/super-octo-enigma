public class FiveSum {
    public static void main(String[] args) {
        int acc = 0;
        int count = 0;
        for (int i = 1 ; i <= 1000; i++) {
            if( i % 3 == 0 && i % 5  == 0) {
                acc += i;
                count++;
                System.out.println(i + " can be divided by both 3 and 5");
                if(count == 5) break;
            }
        }
        System.out.println(acc + " is the total count");
    }
}

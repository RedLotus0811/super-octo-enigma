public class SumOddRange {
    public static void main(String[] args) {
        System.out.println("4 is odd: " + isOdd(4));

    }

    public static boolean isOdd(int number){
        return (number > 0 && (number % 2 != 0));
    }

    public static int sumOdd(int start, int end) {
        if(start < 0 || end < 0) return sumOdd();
        if(end < start) return -1;
        int sum = 0;
        for(int i = start; i <= end ; i++) {
            if(isOdd(i)) sum+= i ;
        }
        return sum;
    }

    public static int sumOdd() {
        return -1;
    }
}

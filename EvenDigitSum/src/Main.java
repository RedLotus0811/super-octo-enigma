public class Main {
    public static void main(String[] args) {
        System.out.println("123456 is " + getEvenDigitSum(123456));
        System.out.println("8 is "+ getEvenDigitSum(8));
        System.out.println("7 is "+ getEvenDigitSum(7));
        System.out.println("252 is "+ getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) return -1;
        int sum = 0;
       do{
         int digit = number % 10;
         System.out.println("Looping!!! number: " + number + " digit: "+ digit);
         number /= 10;
         if(digit % 2 != 0) {
             continue;
         }
         sum += digit;
        } while (number > 0);
        if(sum > 0) return sum;
        return number % 2 == 0 ? number : 0;
    }
}

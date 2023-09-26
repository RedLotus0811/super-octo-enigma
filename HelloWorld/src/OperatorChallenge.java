public class OperatorChallenge {
    public static void main(String[] args) {
        double num1 = 20d;
        double num2 = 80d;
        double sumAndMultiplied = (num1 + num2) * 100d;

        System.out.println("Sum and multiplied: " + sumAndMultiplied);

        double remByFourty = sumAndMultiplied % 40d;

        boolean isDivisibleByFourty = (remByFourty == 0) ;

        System.out.println("Is Divisible by 40? : " + isDivisibleByFourty);

        if(!isDivisibleByFourty) {
            System.out.println("Got some remainder: " + remByFourty);
        } else {
            System.out.println("Got no remainder!");
        }
    }
}

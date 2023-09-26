public class Main {
    public static void main(String[] args) {
        numberToWords(10078);
//        System.out.println(" -321 reversed is : "+ reverse(-321));
    }


    public static void numberToWords(int number) {
        System.out.println(" Number is : " + number);
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int digitCount = getDigitCount(number);
        int reversed = reverse(number);

        StringBuilder numberToWord = new StringBuilder();
        for (int i = 1; i <= digitCount; i++) {
            int digit = reversed % 10;
            String word = getWordForDigit(digit);
            numberToWord.append(" ").append(word);
            reversed /= 10;
        }
        System.out.println(numberToWord);
    }

    public static int reverse(int number) {

        boolean wasNegative = number < 0;

        int cpy = Math.abs(number);

        int reversed = 0;

        while (cpy > 0) {
            reversed *= 10;
            reversed = reversed + (cpy % 10);
            cpy /= 10;
        }
        return wasNegative ? (-1 * reversed) : reversed;
    }

    public static int getDigitCount(int number) {
        if(number < 0) return -1;

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        System.out.println("digit count: " + count);
        return count;

    }

    public static String getWordForDigit(int digit) {
        switch (digit) {
            case 0 -> {
                return  "Zero";
            }
            case 1 -> {
                return  "One";
            }
            case 2 -> {
                return  "Two";
            }
            case 3 -> {
                return  "Three";
            }
            case 4 -> {
                return  "Four";
            }
            case 5 -> {
                return  "Five";
            }
            case 6 -> {
                return  "Six";
            }
            case 7 -> {
                return  "Seven";
            }
            case 8 -> {
                return  "Eight";
            }
            case 9 -> {
                return  "Nine";
            }
            default -> {
                return "Invalid Value";
            }
        }

    }
}

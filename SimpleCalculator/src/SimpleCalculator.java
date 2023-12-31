public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(double num) {
        this.firstNumber = num;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }
    public void setSecondNumber(double num) {
        this.secondNumber = num;
    }

    public double getAdditionResult() {
        return this.firstNumber + this.secondNumber;
    }

    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }

    public double getMultiplicationResult() {
        return this.firstNumber * this.secondNumber;
    }

    public double getDivisionResult() {
        return (secondNumber == 0) ? 0 : (this.firstNumber / this.secondNumber);
    }
}

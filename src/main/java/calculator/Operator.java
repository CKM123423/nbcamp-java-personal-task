package calculator;

public interface Operator {
    public double operate(int firstNum, int secondNum) throws BadInputException;
}

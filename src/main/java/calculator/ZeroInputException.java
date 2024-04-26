package calculator;

public class ZeroInputException extends Exception {
    public ZeroInputException(int secondNum) {
        super("0 으로는 나눌 수 없습니다.");
    }
}

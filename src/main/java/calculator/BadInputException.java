package calculator;

public class BadInputException extends Exception {
    public BadInputException(char type) {
        super("입력이 잘못되었습니다. " + type +  " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /)");
    }
    public BadInputException(int secondNum) {
        super("0 으로는 나눌 수 없습니다.");
    }
}

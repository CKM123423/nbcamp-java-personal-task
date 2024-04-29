package calculator;

public interface Operator {
    // 인터페이스에서 접근제어자는 무조건 public 이므로 하위 멤버들과의 중복으로 인해 public 을 제거 가능
    double operate(int firstNum, int secondNum) throws BadInputException;
}

package calculator;

// 빼기연산을 담당해줄 클래스
public class SubtractOperator implements Operator {
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}

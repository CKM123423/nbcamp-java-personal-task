package calculator;

// 빼기연산을 담당해줄 클래스
public class SubtractOperator implements Operator {
    @Override
    public double operate(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }
}

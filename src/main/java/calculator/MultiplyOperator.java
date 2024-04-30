package calculator;

// 곱하기 연산을 담당해줄 클래스
public class MultiplyOperator implements Operator{
    @Override
    public double operate(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }
}

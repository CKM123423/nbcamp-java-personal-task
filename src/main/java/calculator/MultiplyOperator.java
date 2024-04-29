package calculator;

// 곱하기 연산을 담당해줄 클래스
public class MultiplyOperator implements Operator{
    // 인터페이스의 내용을 정리
    @Override
    public double operate(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
}

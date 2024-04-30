package calculator;

// 더하기 연산을 담당해줄 클래스
public class AddOperator implements Operator {
    // 인터페이스의 내용을 정의
    @Override
    public double operate(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
}

package calculator;

// 나누기 연산을 담당해줄 클래스
public class DivideOperator implements Operator {
    @Override
    public double operate(double firstNum, double secondNum) throws BadInputException {
        if (secondNum == 0) {
            throw new BadInputException("0 으로 나눌 수 없습니다.");
        }
        return firstNum / secondNum;
    }
}

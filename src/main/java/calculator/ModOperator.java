package calculator;

// 나머지를 담당해줄 클래스
public class ModOperator implements Operator {
    @Override
    public double operate(double firstNum, double secondNum) throws BadInputException {
        if (secondNum == 0) {
            throw new BadInputException("0 으로 나눌 수 없습니다.");
        }
        return firstNum % secondNum;
    }
}

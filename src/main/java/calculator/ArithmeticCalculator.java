package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    // 생성자로 초기화 되면 변조되지 않도록 선언
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    // 부모필드의 resultList 를 가지고 새로운 ArrayList 를 선언
    // 각 연산을 담당해줄 클래스들을 새롭게 초기화하여 변조되지 않도록 함
    public ArithmeticCalculator() {
        this.resultList = new ArrayList<>();
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }
    // 사칙연산
    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException{
        double result; // 결과값을 반환하기 위한 지역변수 선언
        if (operator == '+') {
            result = addOperator.operate(firstNum, secondNum);
        } else if (operator == '-') {
            result = subtractOperator.operate(firstNum, secondNum);
        } else if (operator == '*') {
            result = multiplyOperator.operate(firstNum, secondNum);
        } else if (operator == '/') {
            if (secondNum == 0) {
                // 나누기 연사자일때 두번째 입력값이 0이면 익셉션을 발생시키고 오류문 출력
                throw new BadInputException("0 으로 나눌 수 없습니다.");
            }
            result = divideOperator.operate(firstNum, secondNum);
        } else {
            // 사칙연산 이외의 값이 입력 되었다면 익셉션을 발생시키고 오류문 출력
            throw new BadInputException("입력이 잘못되었습니다. " + operator + " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /)");
        }
        setList(result);
        return result;
    }
}

package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    public ArithmeticCalculator() {
        this.resultList = new ArrayList<>();
    }
    // 사칙연산
    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException{
        double result; // 결과값을 반환하기 위한 지역변수 선언
        Operator operator1; // 다형성의 원리를 사용해서 상위의 Operator 를 불러와서 필요할때마다 하위 객체를 불러와 사용
        if (operator == '+') {
            operator1 = new AddOperator();
            result = operator1.operate(firstNum, secondNum);
        } else if (operator == '-') {
            operator1 = new SubtractOperator();
            result = operator1.operate(firstNum, secondNum);
        } else if (operator == '*') {
            operator1 = new MultiplyOperator();
            result = operator1.operate(firstNum, secondNum);
        } else if (operator == '/') {
            operator1 = new DivideOperator();
            result = operator1.operate(firstNum, secondNum);
        } else if (operator == '%') {
            operator1 = new ModOperator();
            result = operator1.operate(firstNum, secondNum);
        }
        else {
            // 사칙연산 이외의 값이 입력 되었다면 익셉션을 발생시키고 오류문 출력
            throw new BadInputException("입력이 잘못되었습니다. " + operator + " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /)");
        }
        setList(result);
        return result;
    }
}

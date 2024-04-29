package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {


    // 부모필드의 resultList 를 가지고 새로운 ArrayList 를 선언
    public ArithmeticCalculator() {
        this.resultList = new ArrayList<>();
    }
    // 사칙연산
    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException{
        int result; // 결과값을 반환하기 위한 지역변수 선언
        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            if (secondNum == 0) {
                // 나누기 연사자일때 두번째 입력값이 0이면 익셉션을 발생시키고 오류문 출력
                throw new BadInputException("0 으로 나눌 수 없습니다.");
            }
            result = firstNum / secondNum;
        } else {
            // 사칙연산 이외의 값이 입력 되었다면 익셉션을 발생시키고 오류문 출력
            throw new BadInputException("입력이 잘못되었습니다. " + operator + " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /)");
        }
        setList(result);
        return result;
    }
}

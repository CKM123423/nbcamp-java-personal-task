package calculator;

import java.util.ArrayList;

public class Calculator {

   ArrayList<Integer> resultList = new ArrayList<>(); // 연산 결과 저장할 리스트 선언과 생성

    // throws 예외처리를 던져서 던진곳에서 처리하도록함
    // throw 예외처리를 강제로 발생시킴
    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException {
        int result = 0; // 결과값을 반환하기위한 지역변수 선언

        try {
            if (operator == '+') {result = firstNum + secondNum;}
            else if (operator == '-') {result = firstNum - secondNum;}
            else if (operator == '*') {result = firstNum * secondNum;}
            else try {
                if (operator == '/') {result = firstNum / secondNum;}
            } catch (ZeroInputException e){
                    System.out.println(e.getMessage());
            }
        } catch (BadInputException e) {
            System.out.println(e.getMessage());
        }

        resultList.add(result); // 리스트에 결과 저장

        return result;
    }
}

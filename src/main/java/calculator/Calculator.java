package calculator;

import java.util.ArrayList;

public class Calculator {

    // 연산 결과 저장할 리스트 선언과 생성
    // private 로 다른 클래스들에서 정보에 접근하지 못하게 함
    private ArrayList<Integer> resultList = new ArrayList<>();

    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException {
        // 사칙연산 기호가 들어왔을때에 결과값 리턴
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
            throw new BadInputException("입력이 잘못되었습니다. " + operator +  " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /)");
        }
        setResultList(result); // setter 를 사용해서 리스트에 계산 결과를 저장
        return result;
    }

    // 데이터를 받아오는 입구 ArrayList 가 private 가 되면서 다른 클래스에서 접근 및 조회할 수 없는 문제를 해결하기 위해서 생성
    public ArrayList<Integer> getResultList() {
        return resultList;
    }

    // 데이터를 주입하는 입구 calculate 가 계산과 배열에 입력 모두를 수행하고 있어서 setter 를 만들어 책임분산
    public void setResultList(int result) {
        this.resultList.add(result);
    }
}
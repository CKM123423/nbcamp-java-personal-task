package calculator;

import java.util.ArrayList;

public abstract class Calculator<T extends Number> {

    // 상속받은 자식클래스를 통해서만 접근할 수 있도록 protected 로 선언
    protected ArrayList<Double> resultList;
    protected T firstNum;
    protected T secondNum;
    protected char operator;

    // firstNum 에 값 넣기
    public void setFirstNum(T firstNum) {
        this.firstNum = firstNum;
    }

    // secondNum 에 값 넣기
    public void setSecondNum(T secondNum) {
        this.secondNum = secondNum;
    }

    // operator 에 값 넣기
    public void setOperator(char operator) {
        this.operator = operator;
    }

    // getter
    public ArrayList<Double> getList() {
        return resultList;
    }

    // setter
    public void setList(double result) {
        resultList.add(result);
    }

    // 첫번째 결과값 삭제
    public void removeFirst() {
        System.out.println("\n가장 먼저 저장된 결과값 [" + (resultList.getFirst()) + "] 이 삭제되었습니다.");
        resultList.removeFirst();
    }

    // 첫번째 결과값 조회
    public void getFirst() {
        System.out.println("가장 먼저 저장된 결과값 : [" + resultList.getFirst() + "] "); // 가장 먼저 저장된 결과값
    }

    // 리스트 내용 조회
    public void inquiryList() {
        System.out.println("현재 저장된 배열의 값들 : ");
        for (Double doubles : resultList) {
            System.out.print("[" + doubles + "] ");
        }
    }

    // 배열의 크기 조회
    public void listSize() {
        System.out.println("\n현재 저장된 배열의 총 개수 : " + getList().size());
    }
}
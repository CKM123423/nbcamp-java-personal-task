package calculator;

import java.util.ArrayList;

public class Calculator {

    // 연산 결과 저장할 리스트 선언과 생성 private 로 다른 클래스들에서 정보에 접근하지 못하게 함
    // 변수명을 바꾸고 사칙연산과 원의 넓이를 저장할 필드 각각 선언
    private ArrayList<Double> ArithmeticList = new ArrayList<>();
    private ArrayList<Double> CircleArea = new ArrayList<>();

    // 원래 자동으로 생성되던 기본 생성자를 명시화하고 생성자가 생성될때마다 새로운 ArrayList 를 만들어 그곳에 데이터를 저장
    // 클래스가 호출될때마다 각 리스트들을 초기화
    public Calculator() {
        this.ArithmeticList = new ArrayList<>();
        this.CircleArea = new ArrayList<>();
    }

    // 사칙연산 계산
    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException {
        ArithmeticCalculator calc1 = new ArithmeticCalculator();
        double result = calc1.calculate(firstNum, operator, secondNum);
        setArithmeticList(result); // setter 를 사용해서 리스트에 계산 결과를 저장
        return result;
    }

    // 사칙연산
    // 데이터를 받아오는 입구 ArrayList 가 private 가 되면서 다른 클래스에서 접근 및 조회할 수 없는 문제를 해결하기 위해서 생성
    public ArrayList<Double> getArithmeticList() {
        return ArithmeticList;
    }

    // 사칙연산
    // 데이터를 주입하는 입구 calculate 가 계산과 배열에 입력 모두를 수행하고 있어서 setter 를 만들어 책임분산
    public void setArithmeticList(double result) {
        this.ArithmeticList.add(result);
    }

    // 사칙연산
    // 리스트에 처음 입력된 값을 삭제하기 위한 메서드
    public void removeArithmeticList() {
        this.ArithmeticList.removeFirst();
    }

    // 사칙연산
    // 결과값이 저장된 List 를 조회해 프린트해주는 메서드
    public void inquiryArithmeticList() {
        for (Double doubles : getArithmeticList()) {
            System.out.print("[" + doubles + "] ");
        }
    }

    // 원의 넓이
    // 원의 넓이를 계산하고 저장하는 메서드
    public double calculateCircleArea(double radius) {
        CircleCalculator calc2 = new CircleCalculator();
        double result = calc2.calculateCircleArea(radius);
        setCircleArea(result); // CircleArea 에 결과값 추가
        return result;
    }

    // 원의 넓이
    // CircleArea 의 값을 조회하는데에 사용
    public ArrayList<Double> getCircleArea() {
        return CircleArea;
    }

    //원의 넓이
    // CircleArea 에 값을 넣어주는데에 사용
    public void setCircleArea(double radius) {
        this.CircleArea.add(radius);
    }

    // 원의 넓이
    // 첫번째 저장값 삭제
    public void removeCircleArea() {
        this.CircleArea.removeFirst();
    }

    // 원의 넓이
    // 원의 넓이가 저장된 CircleArea 의 데이터를 시스템에 출력
    public void inquiryCircleArea() {
        for (Double doubles : getCircleArea()) {
            System.out.print("[" + doubles + "] ");
        }
    }
}
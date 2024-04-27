package calculator;

public class ArithmeticCalculator extends Calculator {

    // ArithmeticCalculator 클래스가 생성되었을때 각각의 연산기능을 가진 클래스들을 인스턴스화 (포함관계)
    // 클래스 내부에서만 계산을 진행하고 연산기능이 바뀌는 것을 막기위한 private final 로 선언
    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;

    // 생성자가 호출될때 초기화를 해주면서 각각의 클래스들이 최대한 온전한 상태로 기능을 가져올 수 있도록 함
    //
    public ArithmeticCalculator() {
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    // 계산에 필요한 연산자와 숫자들을 매개변수로 받고 연산자를 통해 각각의 연산기능을 실행할 수 있도록 구현
    public double calculate(int firstNum, char operator, int secondNum) throws BadInputException{
        double result; // 결과값을 반환하기 위한 지역변수 선언
        if (operator == '+') {
            result = addOperator.add(firstNum, secondNum);
        } else if (operator == '-') {
            result = subtractOperator.subtract(firstNum, secondNum);
        } else if (operator == '*') {
            result = multiplyOperator.multiply(firstNum, secondNum);
        } else if (operator == '/') {
            result = divideOperator.divide(firstNum, secondNum);
        } else {
            // 사칙연산 이외의 값이 입력 되었다면 익셉션을 발생시키고 오류문 출력
            throw new BadInputException("입력이 잘못되었습니다. " + operator + " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /)");
        }
        return result;
    }
}

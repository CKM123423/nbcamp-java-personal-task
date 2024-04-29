package calculator;

public enum OperatorType {

    // 서로 관련되어 있는 상수들을 모아 열거한것
    // 연산자들을 정의
    // class OperatorType{
    //      public static final OperatorType plus = new OperatorType ....
    //}
    // 위랑 같음
    // 딱히 매개변수가 필요 없으나 매개변수가 필요한 상황이 된다면 생성자에서 받아오고 각각 정의해주면 됨
    Plus, Minus, Multiply, Divide, Mod;

    // operator 값을 받아와서 해당하는 enum 에 해당되는 상수로 리턴
    public static OperatorType setOperator(char operator) throws BadInputException {
        OperatorType type;
        switch (operator) {
            case '+' -> type = Plus;
            case '-' -> type = Minus;
            case '*' -> type = Multiply;
            case '/' -> type = Divide;
            case '%' -> type = Mod;
            default -> throw new BadInputException("입력이 잘못되었습니다. " + operator + " 대신 사칙연산자에 해당되는 연산자를 넣어주세요. (+, -, *, /, %)");
        }
        return type;
    }
}

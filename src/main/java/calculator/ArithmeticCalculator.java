package calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {

    // 다형성의 원리를 사용해서 상위의 Operator 를 불러와서 필요할때마다 하위 객체를 불러와 사용
    private Operator operateType;

    public ArithmeticCalculator() {
        this.resultList = new ArrayList<>();
    }

    // calculate 에서 매개변수로 enum 클래스의 타입을 받아와 받아온 값에 따라 적절한 인스턴스화를 구현
    public double calculate(OperatorType type) throws BadInputException {

        // 매개변수에서 받아온 type 이 해당 상수일경우 해당하는 객체를 생성하여 계산
        // switch 에서 조건으로 가능한 enum 을 사용해서 if else 문을 없애고 가독성이 오름
        switch (type) {
            case Plus -> operateType = new AddOperator();
            case Minus -> operateType = new SubtractOperator();
            case Multiply -> operateType = new MultiplyOperator();
            case Divide -> operateType = new DivideOperator();
            case Mod -> operateType = new ModOperator();
        }
        double result = operateType.operate(firstNum, secondNum);
        setList(result);
        return result;
    }
}
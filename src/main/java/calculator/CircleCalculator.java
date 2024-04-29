package calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    // 원의 원주율을 구하기위한 원주율값 선언
    // final 로 선언하여 값이 절대 변하지 않도록 함
    //원의 넓이를 구할 때마다 무조건 쓰이는 값이라 메모리의 부담을 줄이기위해 static 으로 선언
    private static final double PI = 3.14;

    // 부모필드의 resultList 를 가지고 새로운 ArrayList 를 선언
    public CircleCalculator() {
        resultList = new ArrayList<>();
    }
    public double calculateCircleArea(double radius) {
        double result = PI * radius * radius;
        setList(result);
        return result;
    }
}
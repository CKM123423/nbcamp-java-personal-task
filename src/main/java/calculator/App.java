package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        1. Scanner 를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
//                - 양의 정수는 각각 하나씩 전달 받습니다.
//                - 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int firstNum = sc.nextInt(); // 첫번째 변수를 int 값으로 저장
        System.out.println("두 번째 숫자를 입력하세요.");
        int secondNum = sc.nextInt(); // 두번째 변수를 int 값으로 저장
    }
}

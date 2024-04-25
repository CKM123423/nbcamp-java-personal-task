package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        1. Scanner 를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있습니다.
//                - 양의 정수는 각각 하나씩 전달 받습니다.
//                - 양의 정수는 적합한 타입으로 선언한 변수에 저장합니다.
        Scanner sc = new Scanner(System.in);
        String end = "";
        while (!end.equals("exit")) {
            System.out.println("첫 번째 숫자를 입력하세요.");
            int firstNum = sc.nextInt(); // 첫번째 변수를 int 값으로 저장
            System.out.println("두 번째 숫자를 입력하세요.");
            int secondNum = sc.nextInt(); // 두번째 변수를 int 값으로 저장
            System.out.println("사칙연산 기호를 입력하세요."); // +, -, *, /
            // sc.next 가 받은 String 타입의 문자열중 charAt(i) i번 째의 값을 char 형태로 저장 ( i는 0부터 시작 )
            char operator = sc.next().charAt(0);
            // 계산을 받을 int 선언
            int result = 0;

            // 0으로 나눌 수 없기 때문에 0이 입력되면 오류문 출력
            if (secondNum == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 입력될 수 없습니다.");
                result = firstNum; // 0으로 나눌경우 첫번째 정수값 출력
            } else {
                result = switch (operator) {
                    case '+' -> firstNum + secondNum;
                    case '-' -> firstNum - secondNum;
                    case '*' -> firstNum * secondNum;
                    case '/' -> firstNum / secondNum;
                    default -> result;
                };
            }
            System.out.println("결과 = " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            end = sc.next(); // exit 를 입력받으면 종료되며 입력받지 않으면 무한반복
        }
    }
}

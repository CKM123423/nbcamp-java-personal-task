package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        int firstNum = sc.nextInt(); // 첫번째 변수를 int 값으로 저장
        System.out.println("두 번째 숫자를 입력하세요.");
        int secondNum = sc.nextInt(); // 두번째 변수를 int 값으로 저장
        System.out.println("사칙연산 기호를 입력하세요."); // +, -, *, /
        // sc.next 가 받은 String 타입의 문자열중 charAt(i) i번 째의 값을 char 형태로 저장 ( i는 0부터 시작 )
        char operator = sc.next().charAt(0);

        // 0으로 나눌 수 없기 때문에 0이 입력되면 오류문 출력
        if (secondNum == 0) {
            System.out.println("나눗셈 연산에서 분모(두번째 정수)는 0이 입력될 수 없습니다.");
        } else {
            switch (operator) {
                case '+': System.out.println(firstNum + secondNum); break;
                case '-': System.out.println(firstNum - secondNum); break;
                case '*': System.out.println(firstNum * secondNum); break;
                case '/': System.out.println((double)(firstNum / secondNum)); break;
            }
        }
    }
}

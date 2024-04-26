package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws BadInputException {
        Calculator calc = new Calculator(); // Calculator 를 실행할 수 있도록 객체 생성
        Scanner sc = new Scanner(System.in);

        // exit 입력창에서 exit 를 입력받을때까지 무한반복 (어디서든 exit 를 쓰면 종료되는 문제점 해결)
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요.");
            int firstNum = sc.nextInt(); // 첫번째 변수를 int 값으로 저장

            System.out.println("두 번째 숫자를 입력하세요.");
            int secondNum = sc.nextInt(); // 두번째 변수를 int 값으로 저장

            System.out.println("사칙연산 기호를 입력하세요."); // +, -, *, /
            // sc.next 가 받은 String 타입의 문자열중 charAt(i) i번 째의 값을 char 형태로 저장 ( i는 0부터 시작 )
            char operator = sc.next().charAt(0);

            System.out.println("결과 = " + calc.calculate(firstNum, operator, secondNum));

            System.out.println("가장 먼저 저장된 결과값 : [" + calc.getResultList().getFirst() + "] "); // 가장 먼저 저장된 결과값
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
            if (sc.next().equals("remove")) {
                System.out.println("\n가장 먼저 저장된 결과값 [" + calc.getResultList().getFirst() + "] 이 삭제되었습니다.");
                calc.removeResult(); // 가장 처음 저장된 결과값을 삭제 Calculator 에서 만든 메서드로 접근해서 수정
            }

            System.out.println("현재까지 저장된 모든 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                System.out.println("현재 저장된 배열의 값들 : ");
                calc.inquiryList(); // inquiry 입력시 List 의 값들을 읽어와 프린트 해주는 메서드
            }
            // 현재 저장된 결과값의 총 개수
            System.out.println("\n현재 저장된 배열의 총 개수 : " + calc.getResultList().size());
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // while 문을 무한반복으로 바꾼뒤 해당 부분에서 exit 가 입력될경우 while 문 탈출
            if (sc.next().equals("exit")) {
                break;
            }
        }
    }
}

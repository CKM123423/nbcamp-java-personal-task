package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws BadInputException {
        ArithmeticCalculator arithmetic = new ArithmeticCalculator(); // 사칙연산을 하기위한 인스턴스화
        CircleCalculator circle = new CircleCalculator(); // 원의넓이를 구하기 위한 인스턴스화
        Scanner sc = new Scanner(System.in);

        // exit 입력창에서 exit 를 입력받을때까지 무한반복 (어디서든 exit 를 쓰면 종료되는 것을 회피)
        while (true) {
            System.out.println("어떤 기능을 사용 하시겠습니까?");
            System.out.println("1. 사칙연산 ('1' 을 입력해 시작하세요.)");
            System.out.println("2. 원의 넓이 계산('2' 를 입력해 시작하세요.)");
            int choice = sc.nextInt(); // 어떤 작업을 수행할지에 선택에 대한 조건으로 쓰기위해 선언

            if (choice == 1) {
                System.out.println("첫 번째 숫자를 입력하세요.");
                arithmetic.setFirstNum(sc.nextDouble()); // Calculator 의 필드에 값저장

                System.out.println("사칙연산 기호를 입력하세요."); // +, -, *, /
                // sc.next 가 받은 String 타입의 문자열중 charAt(i) i번 째의 값을 char 형태로 저장 ( i는 0부터 시작 )
                arithmetic.setOperator(sc.next().charAt(0));

                System.out.println("두 번째 숫자를 입력하세요.");
                arithmetic.setSecondNum(sc.nextDouble()); // Calculator 의 필드에 값저장

                // 부모 클래스 필드에 저장된 arithmetic operator 의 값을 OperatorType 에 보내서 값을 받고 그 매개변수로 메서드 작동
                System.out.println("결과 = "+ arithmetic.calculate(OperatorType.setOperator(arithmetic.operator)));
                arithmetic.getFirst();// 첫번째 결과 출력

                System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                if (sc.next().equals("remove")) {
                    arithmetic.removeFirst(); // 가장 처음 저장된 결과값을 삭제
                }

                System.out.println("현재까지 저장된 모든 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.next().equals("inquiry")) {
                    arithmetic.inquiryList(); // inquiry 입력시 List 의 값들을 읽어와 프린트 해주는 메서드
                }

                arithmetic.listSize(); // 현재 저장된 결과값의 총 개수

            } else if (choice == 2) {
                // 위의 사칙연산과 동일한 내용을 수행하도록 구현
                // 새로운 CircleArea 리스트를 만들어서 사칙연산과 따로따로 저장되도록 구현
                System.out.println("원의 반지름을 입력해주세요");
                circle.setFirstNum(sc.nextDouble()); // Calculator 의 필드에 값저장
                System.out.println("결과 = " + circle.calculateCircleArea());
                circle.getFirst(); // 결과값 조회
                System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
                if (sc.next().equals("remove")) {
                    circle.removeFirst();
                }
                System.out.println("현재까지 저장된 모든 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.next().equals("inquiry")) {
                    circle.inquiryList(); // inquiry 입력시 List 의 값들을 읽어와 프린트 해주는 메서드
                }
                // 현재 저장된 결과값의 총 개수
                circle.listSize();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // while 문을 무한반복으로 바꾼뒤 해당 부분에서 exit 가 입력될경우 while 문 탈출
            if (sc.next().equals("exit")) {
                break;
            }
        }
    }
}

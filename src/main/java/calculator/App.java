package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> resultList = new ArrayList<>(); // 결과값을 저장할 리스트 선언
        // exit 입력창에서 exit 를 입력받을때까지 무한반복 (어디서든 exit 를 쓰면 종료되는 문제점 해결)
        while (true) {
            Scanner sc = new Scanner(System.in);
            int result = 0; // 계산을 받을 int 선언

            System.out.println("첫 번째 숫자를 입력하세요.");
            int firstNum = sc.nextInt(); // 첫번째 변수를 int 값으로 저장
            System.out.println("두 번째 숫자를 입력하세요.");
            int secondNum = sc.nextInt(); // 두번째 변수를 int 값으로 저장
            System.out.println("사칙연산 기호를 입력하세요."); // +, -, *, /
            // sc.next 가 받은 String 타입의 문자열중 charAt(i) i번 째의 값을 char 형태로 저장 ( i는 0부터 시작 )
            char operator = sc.next().charAt(0);


            // 0으로 나눌 수 없기 때문에 두번째 정수에 0과 나눗셈이 입력되면 오류문 출력
            if (secondNum == 0 && operator == '/') {
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

            resultList.add(result); // 리스트에 결과 저장
            System.out.println("결과 = " + result);

            System.out.println("\n현재 저장된 배열의 총 개수 : " + resultList.size());
            System.out.println("현재 저장된 배열의 값들 : ");
            // 현재 저장된 배열 값 확인
            for (int i = 0; i < resultList.size(); i++){
                System.out.print("[" + resultList.get(i) + "] ");
            }
            System.out.println("가장 먼저 저장된 결과값 : " + resultList.getFirst()); // 가장 먼저 저장된 결과값
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
            if (sc.next().equals("remove")) {
                System.out.println("가장 먼저 저장된 결과값 " + resultList.getFirst() + " 이 삭제되었습니다.");
                resultList.removeFirst(); // 가장 처음 저장된 결과값을 삭제
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            // while 문을 무한반복으로 바꾼뒤 해당 부분에서 exit 가 입력될경우 while 문 탈출
            if (sc.next().equals("exit")) {
                break;
            }

            System.out.println("\n현재 저장된 배열의 총 개수 : " + resultList.size());
            System.out.println("현재 저장된 배열의 값들 : ");
            // 현재 저장된 배열 값 확인 (삭제후)
            for (int i = 0; i < resultList.size(); i++){
                System.out.print("[" + resultList.get(i) + "] ");
            }
        }
    }
}

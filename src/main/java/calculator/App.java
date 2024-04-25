package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String end = ""; // 종료문을 입력받을 변수 선언
        int[] resultArray = new int[10]; // 결과 값을 저장할 배열 선언
        int count = 0; // 배열에 순차적으로 저장하기 위한 변수값
        while (!end.equals("exit")) {
            Scanner sc = new Scanner(System.in);
            int result = 0; // 계산을 받을 int 선언

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

            if (count == 10){
                resultArray[0] = 0; // 가장 처음 입력된 값을 0으로 초기화
                // 결과값을 왼쪽으로 한칸씩 이동
                for (int i = 0; i < resultArray.length - 1 ; i++){
                    resultArray[i] = resultArray[i + 1];
                }
                count--; // if문 빠져나오기위해 카운트를 - 1
            }

            resultArray[count] = result; // 계산 결과를 배열에 저장
            count = count + 1; // 총 저장된 개수 카운트

            System.out.println("결과 = " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            end = sc.next(); // exit 를 입력받으면 종료되며 입력받지 않으면

            // 현재 저장된 배열 값 확인
            System.out.println("현재 저장된 배열의 값들 : ");
            for (int i = 0; i < resultArray.length; i++){
                System.out.print(" [" + resultArray[i] + "] ");
            }
            System.out.println("\n현재 저장된 배열의 총 개수 : " + count);
        }
    }
}

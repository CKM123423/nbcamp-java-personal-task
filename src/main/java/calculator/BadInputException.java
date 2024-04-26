package calculator;

public class BadInputException extends Exception {
    // 해다 익셉션 메소드가 실행되면 받은 메세지(오류문)을 출력
    public BadInputException(String msg) {
        System.out.println(msg);
    }
}

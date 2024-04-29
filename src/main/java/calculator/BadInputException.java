package calculator;

public class BadInputException extends Exception {
    // 해다 익셉션 메소드가 실행되면 받은 메세지(오류문)을 출력
    // 해당 기능을 수행하는 익셉션이 있지만 익셉션에 대한 이해를 돕기위한 커스텀 익셉션
    public BadInputException(String msg) {
        System.out.println(msg);
    }
}

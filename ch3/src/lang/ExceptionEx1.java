package lang;

// Throwable 가 부모
// Exception(예외)
// 예외의 종류
// 1. 컴파일 예외 : ClassNotFoundException
// 2. 런타임 예외 : ArithmeticException
// 처리방법
// 예외 처리 try, catch
// 예외 던지기 throw ClassNotFoundException
// Error
public class ExceptionEx1 {
    public static void main(String[] args) {
        System.out.println(4 / 0); // java.lang.ArithmeticException: / by zero

        try {// 예외가 발생할 수 있는 코드 작성
            Class.forName(null);
        } catch (ClassNotFoundException e) {// 발생하면, 개발자 확인용
            e.printStackTrace();
        } // 컴파일 예외의 예시. 바로 붉은 줄이 생김
    }
}

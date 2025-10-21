package object;

// 매서드 사용이유 : 재사용성 높다
// 중복된 코드를 제거
// 프로그램 구조화
// 인스턴스 메서드  : 클래스 영역 -> 인스턴스 생성후
// 클래스 메서드 : 클래스 영역(static) -> 클래스가 메모리에 올라갈 때(공유) 쓸 수 있다.
public class MethodTest {
    // 두 개의 인자(== 매개변수)를 받아서 덧셈 후 덧셈 결과 리턴
    int sum(int num1, int num2) {
        int result = num1 + num2;
        return result; // int가 result의 기본변수이기에
    }

    // 두 개의 인자(실수)를 받아서 뺄셈 후 뺄셈 결과 리턴
    double subtract(double num1, double num2) {// () 안에서 인자로 선언된 변수들은 {} 안에서만유효범위
        return num1 - num2;
    }

    // 두 개의 인자(float 타입)를 받아서 나눗셈 후 나눗셈 결과 리턴
    double divide(float num3, float num4) {// 형변환 가능
        return num3 / num4;
    }

    // 두 개의 문자열 인자를 받아서 하나의 문자열로 리턴
    String contact(String str1, String str2) {
        return str1 + str2;
    }

    // 한 개의 int 타입 배열을 받아서 배열을 리턴
    // int[] arr = new int[1];
    // int[] arr = ( 3, 4, 5 );
    int[] call(int[] arr) {
        return arr;
    }

    String print() {
        return "안녕하세요";
    }// ()가 필수는 아님
}

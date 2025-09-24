package operator;

public class OperatorEx3 {
    public static void main(String[] args) {
        // 비교연산자 > < >= <= ==(같다) !=(같지않다)
        // true or false 결과값

        int a = 10;
        float f = 10.0f;
        // 연산 수행 전 피연산자의 타입을 맞춘 후 비교
        System.out.println(a == f); // ture
        System.out.println(a != f); // false
        System.out.printf("'A' == 65 = %b\n", 'A' == 65);
    }
}

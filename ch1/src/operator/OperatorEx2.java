package operator;

public class OperatorEx2 {
    public static void main(String[] args) {

        int a = 10, b = 4;
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d - %d = %d\n", a, b, a - b);
        System.out.printf("%d * %d = %d\n", a, b, a * b);
        System.out.printf("%d / %d = %d\n", a, b, a / b); // 2
        System.out.printf("%d % %% = %d\n", a, b, a % b); // 나머지 출력
        System.out.printf("%d / %f = %f\n", a, (float) b, a / (float) b); // 2.5

        // 서로 다른 타입의 연산결과는 큰 타입을 따라간다
        // int/int -> int
        // int/float -> float
        // int/double -> double

        char c1 = 'a', c2 = c1, c3 = ' ';

        // c3 = c1 + 1; char 보다 int가 더크기 때문에 오류임. 1 사용시 기본타입 int로 인식하기에
        c3 = (char) (c1 + 1);
        int i = c1 + 1; // byte, chort, char 연산 시 자동으로 int 로 변환됨
        c2++;
        System.out.println("i = " + i);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

        for (char j = 'a'; j <= 'z'; j++) {
            System.out.print(j + " ");
        }
    }
}

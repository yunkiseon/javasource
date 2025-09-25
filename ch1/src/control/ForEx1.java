package control;

public class ForEx1 {
    public static void main(String[] args) {

        // int i = 0; 은 초기화, i , args, length; 은 조건식, i++ 은 증감식이라고 한다
        // 조건식이 참인 동안 반복적으로 수행할 문장

        // for (int i = 0; i < 10; i++) {
        // System.out.println(i +"안녕하세요");
        // }

        // i =+ 2 -> i = i = 2
        // for (int i = 0; i < 10; i += 2) {
        // System.out.println(i + "안녕하세요");
        // }
        // for (int i = 10; i > 0; i--) {
        // System.out.println(i + "안녕하세요");
        // }
        // for (int i = 10, j = 1; i > 0; i--, j++) {

        // }
        // 1 ~ 10까지 출력
        // for (int i = 1; i < 11; i++) {
        // System.out.print(i + " ");
        // }

        // 1~10 합계 구하기
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            // sum = sum + i;
            sum += i;
            System.out.println("1 ~ 10까지 합 " + sum);
        }
        // 1. int i = 1; 실행
        // 2. i <= 10; 조건식 검사 → true
        // 3. for 구문 안으로 진입 후 구문 실행
        // 4. i++ 실행
        // 5. 조건식 검사 → 2, 3, 4 반복 시행 되다가 → false 되면 종료
    }
}

package control;

public class ExamEx5 {
    public static void main(String[] args) {
        // 주사위 2개를 던져서 나오는 눈의 합이 5가 아니면 주사위를 계속 던지고
        // 눈의 합이 5이면 주사위를 실행을 멈춘다.
        // 나온 눈 (1, 3) 식으로 출력
        while (true) {
            int dice1 = (int) (Math.random() * 6) + 1;
            int dice2 = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)\n", dice1, dice2);
            if (dice1 + dice2 == 5) {
                break;
            }
        }
    }
}

package control;

public class ForEx3 {
    public static void main(String[] args) {
        // 중첩 for **********
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < 10; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // 1) 바깥쪽 for int i = 0; 실행
        // 2) 바깥쪽 for i < 5;
        // 3) 안쪽 for 의 int j = 0; 실행
        // 4) 안쪽 for j < 10;
        // 5) system.out.print("*"); -> *
        // 6) 안쪽 for j++
        // 7) 안쪽 for j < 10;
        // 8) system.out.print("*"); -> **
        // 9) 6~8 반복 수행되며
        // 10) j가 10이 되면 j < 10; -> 안쪽 for 문 종료
        // 11) system.out.print()
        // 12) i++;
        // 13) 다시 반복 되다가 i < 5에서 종료
        // 14) 즉, 바깥쪽 for 은 행, 안쪽 for 은 열 담당.

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

    }
}

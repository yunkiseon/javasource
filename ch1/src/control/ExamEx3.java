package control;

import java.util.Scanner;

public class ExamEx3 {
    public static void main(String[] args) {
        // 하루 일당 산출
        // 8 시간까지는 10,030. 그 이후는 원래 금액의 1.5배
        // 오늘 근무시간을 입력 받은 후 하루 일당 산출
        // 일당은 정수형

        Scanner sc = new Scanner(System.in);
        System.out.print("근무시간을 적으세요");
        int hours = Integer.parseInt(sc.nextLine());
        int rate = 10030, pay = 0;

        if (hours > 8) {
            pay = 8 * rate + (int) ((hours - 8) * rate * 1.5);
        } else {
            pay = hours * rate;
        }
        System.out.printf("근무시간 %d, 임금 : %d", hours, pay);
        sc.close();
    }
}

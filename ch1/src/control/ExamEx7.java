package control;

import java.util.Scanner;

public class ExamEx7 {
    public static void main(String[] args) {
        // ----------------------------------------
        // 1. 예금 || 2. 출금 || 3. 잔고 || 4. 종료
        // ----------------------------------------
        // 선택 >> 1
        // 입금액 >> 100000
        // 선택 >> 2
        // 출금액 >> 20000
        // 선택 >> 3
        // 잔고 80000
        // 선택>> 4
        // 프로그램 종료

        boolean run = true;
        Scanner sc = new Scanner(System.in);
        int balance = 0; // 잔액
        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.println("선택 >> ");
            int menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.print("입금액 >> ");
                    // int money = Integer.parseInt(sc.nextLine()); money의 변수 유효범위(case2에서도 사용하기에)문제
                    // 해결 + 코드 간략화를 위해서 아래만 쓴다
                    balance += Integer.parseInt(sc.nextLine());
                    break;

                case 2:
                    System.out.println("출금액 >> ");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.println("잔액 >> " + balance);
                    break;
                case 4:
                    run = false;
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}

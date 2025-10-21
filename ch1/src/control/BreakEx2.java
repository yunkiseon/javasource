package control;

import java.util.Scanner;

public class BreakEx2 {
    public static void main(String[] args) {
        // 메뉴를 보여준 후 메뉴 선택 - 1, 2, 3
        // 메뉴번호가 1~3 사이인데 다른 번호를 입력하면 다시 메뉴를 보여주고
        // 메뉴번호가 0번이면 프로그램을 종료한다.

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) square log");
            System.out.println("원하시는 메뉴 (1~3)를 선택하세요. (종료 : 0)");

            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 0) {
                System.out.println("프로그램 종료");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다. (종료 : 0)");
                continue;
            }
            System.out.println("선택한 메뉴는 " + menu + "입니다.");
        }
        sc.close();
    }
}

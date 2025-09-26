package control;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // int i = 10;
        // do {
        // System.out.println(i);
        // } while (i < 10);

        // 1 ~ 100 사이의 정수를 입력받기
        // 컴퓨터 임의 수 : 1 ~ 100 사이의 정수
        int answer = (int) (Math.random() * 100) + 1;
        // 컴퓨터가 생성한 임의의 수를 맞추기

        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("1 ~ 100 사이의 정수를 입력하세요");
            num = Integer.parseInt(sc.nextLine());
            if (num < answer) {
                System.out.println("더 큰 수로 시도해 보세요");
            }
            if (num > answer) {
                System.out.println("더 작은 수로 시도해 보세요");
            }
        } while (answer != num);
        System.out.println("정답입니다");
        sc.close();
    }
}

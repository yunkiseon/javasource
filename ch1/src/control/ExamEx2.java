package control;

import java.util.Scanner;

public class ExamEx2 {
    public static void main(String[] args) {
        // 세 개의 정수를 입력받아 가장 작은 값 구하기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 수 : ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("두 번째 수 : ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("세 번째 수 : ");
        int num3 = Integer.parseInt(sc.nextLine());

        int min = num1;

        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        System.out.println("가장 작은 수 " + min);

        // 가장 큰수구하기
        int max = num1;

        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        System.out.println("가장 큰 수" + max);
        sc.close();
    }
}

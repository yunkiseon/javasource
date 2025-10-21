package control;

import java.util.Scanner;

public class SoloEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        if (num % 2 == 0) {
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
        sc.close();
    }
}

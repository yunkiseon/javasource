package basic;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수 입력 : ");
        String num = sc.nextLine();
        System.out.println("num = " + num);
        System.out.println("num = " + (num + 1));
        int input = Integer.parseInt(num);
        System.out.println("input = " + input);
        System.out.println("input = " + (input + 1));
        sc.close();
    }
}

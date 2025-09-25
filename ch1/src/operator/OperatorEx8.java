package operator;

import java.util.Scanner;

public class OperatorEx8 {
    public static void main(String[] args) {
        // 키보드에서 숫자를 하나 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = Integer.parseInt(sc.nextLine());

        // 입력받은 숫자가 짝수, 홀수인지 출력하기
        // System.out.println(num % 2 == 0 ? "짝수" : "홀수");
        String result = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(result);
        sc.close();
    }
}

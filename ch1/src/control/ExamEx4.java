package control;

import java.util.Scanner;

public class ExamEx4 {
    public static void main(String[] args) {
        // 사칙연산(+ - * /) 계산기
        // 사용자로부터 2개의 숫자와 연산자를 입력받기
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 입력 : ");
        int input1 = Integer.parseInt(sc.nextLine());
        System.out.print("두번째 숫자 입력 : ");
        int input2 = Integer.parseInt(sc.nextLine());
        System.out.print("연산자 입력 : ");
        String op = sc.nextLine();

        // op.equals("+") 식으로 해도 됨

        int result = 0;
        switch (op) {
            case "+":
                result = input1 + input2;
                break;
            case "-":
                result = input1 - input2;
                break;
            case "*":
                result = input1 * input2;
                break;
            case "/":
                result = input1 / input2;
                break;

            default:

                break;
        }
        System.out.printf("%d %s %d = %d", input1, op, input2, result);
        sc.close();
    }
}

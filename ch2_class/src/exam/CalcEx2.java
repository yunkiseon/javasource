package exam;

import java.util.Scanner;

public class CalcEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Num1 : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input Num2 : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Input operator : ");
        String op = scanner.nextLine();

        Calc calc = null;// 객체를 자식들이 아닌 부모로 선언, setvalue는 어차피 부모의 것. calculate는 오버라이딩 되어있다.
        // 지역변수는 반드시 초기화를 해줘야 한다. calc의 경우는 null. 수-int 나 long 등 은 0으로.
        switch (op) {
            case "+":
                calc = new Add();
                break;
            case "-":
                calc = new Sub();
            case "*":
                calc = new Mul();
                break;
            case "/":
                calc = new Div();
                break;
            default:
                break;
        }
        calc.setValue(num1, num2);
        System.out.println(calc.calculate());
    }

}

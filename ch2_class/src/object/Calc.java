package object;

public class Calc {
    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {// x, y 값을 이용하여 평균 구하기
        int result = plus(x, y);// return한 plus 이기에 변수에 담거나 출력해야함. 지금은 변수에 넣는, 다른 메소드를 호출할 수 있다.
        return result / 2;
    }

    void execute() {
        double result = avg(15, 8);
        println("실행결과 : " + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}

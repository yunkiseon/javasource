package object;

public class MyMath {
    // 메소드 오버로딩
    // 이름이 같아야 한다
    // 매개변수의 개수 도는 타입이 달라야 한다.
    long add(long a, long b) {// 괄호 안까지 동일해선 안된다 -> 변수명이 아닌 타입이
        return a + b;
    }

    long add(long a, long b, int c) {
        return a + b;
    }

    int add(int a, int b) {
        return a + b;
    }

    long substract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(long a, long b) {
        return a / b;
    }
}

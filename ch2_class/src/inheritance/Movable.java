package inheritance;

public interface Movable {
    // 인터페이스에선 무조건 상수만 선언할 수 있다.
    int pos = 0; // 멤버변수에 final 을 붙이면 상수가 됨-> 초기화 개념이 무조건 따라와야한다

    void move(int x, int y);// interface는 바디를 가질 수 없음
    // 일반 메서드를 만들고 싶다면 static, default 를 붙이면 가능

    static void print() {

    }

    default void print2() {

    }

}

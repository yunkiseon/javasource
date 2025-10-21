package inheritance;

public class Child extends Parent {
    public Child() {
        super(15);// 를 입력하지 않아도 숨겨져있다 super -> 부모 생성자 호출 이란 의미
    }

    void play() {
        System.out.println("play!!!");
    }

    @Override
    public void list() {
        super.list();
        System.out.println("자식 클래스");
    }
}

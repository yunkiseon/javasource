package inheritance;

public class AEx {
    public static void main(String[] args) {
        A obj = new A();
        // B b = new B();
        obj.methodA(new B());
        // 클래스가 서로 연결되면 의존성이 높다고 한다.
    }
}

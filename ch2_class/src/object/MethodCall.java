package object;

public class MethodCall {
    int iv = 10;
    static int cv = 20;
    int iv2 = cv;

    static void staticMethod1() {
        MethodCall obj = new MethodCall();
        System.out.println(obj.iv);
        System.out.println(cv);// iv는 부를 수 없음, iv 가 인스턴스 변수이기 인스턴스를 생성해야 부를 수 있다.
    }

    void instanceMethod1() {// static이 없기에 new를 해야 올라온다.
        // static 변수 호출
        System.out.println(cv);// cv는 static이라 먼저 올라가있기에 가능
        // 인스턴스 변수 호출
        System.out.println(iv);// 인스턴스 변수와 함께 올라가(인스턴스 생성 시)서 가능하다.
    }

    static void staticMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        MethodCall obj = new MethodCall();
        obj.instanceMethod1();// 인스턴스 생성 없인 불가능하다.
    }

    void instanceMethod2() {
        // 클래스 메소드 호출
        staticMethod1();
        // 인스턴스 메소드 호출
        instanceMethod1();
    }// 내부에서 이러한 개념이 적용되나, 외부에서 부를 때도 동일하다
}

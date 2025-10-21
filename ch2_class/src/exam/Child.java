package exam;

public class Child extends Parent {
    public void print() {
        // num1 변수 값 변경
        super.setNum1(10);
        // num1 조회
        System.out.println(getNum1());
        System.out.println(super.name);
        System.out.println(super.grade);

    }
}

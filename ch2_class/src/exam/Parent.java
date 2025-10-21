package exam;

public class Parent {
    // 일반적으로 멤버변수(속성)는 외부 접근 차단 시킴
    private int num1;
    String name;
    protected String grade;

    private int print() {// private 메서드는 외부에서 확인, 사용 불가. 내부에서만 사용
        return 0;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

}

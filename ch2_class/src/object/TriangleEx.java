package object;

public class TriangleEx {
    public static void main(String[] args) {
        // 속성(멤버변수) 초기화 방법
        // 1. 직접접근(속성에) : 사용 빈도가 낮다 private 하면 사용불가능
        // triangle1.baseline = 12;
        // triangle1.height = 6;
        // 2. 생성자
        Triangle triangle1 = new Triangle(12, 6);
        System.out.println("넓이 : " + triangle1.getArea());

        // setter 메소드
        Triangle triangle2 = new Triangle();
        triangle2.setBaseline(10);
        triangle2.setHeight(5);
        System.out.println("넓이 : " + triangle2.getArea());
    }
}

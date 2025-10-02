package inheritance;

public class Circle extends Shape {// 상속관계
    // int x; x좌표
    // int y; y좌표
    Point point = new Point(); // 포함관계
    int r;// 반지름

    public Circle(Point point, int r) {
        this.point = point;
        this.r = r;
    }
    // x, y, color 출력하고 싶다-> 오버라이딩

    @Override
    void draw() {
        System.out.printf("[x = %d, y = %d, color = %s]", point.x, point.y, color);
        super.draw();
    }

}

package inheritance;

public class ShapeEx {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point[] points = { new Point(10, 10), new Point(20, 20), new Point(30, 30) };
        // 위와 동일하게 Point[] points = new Point[3];
        // points[0].x = 10;
        // points[0].y = 10; ... 해도 된다. 하지만 이 경우 new를 안했기 때문에 nullpintException이 난다.
        // points[0] = new Point(); 를 선언하고 위의 points[0].x = 10을 해야된다.
        // 물론 Points[] points = new Point[3]이 선언된 상태에서
        // points[0] = new Point(x :10, y: 10);의 형태로 선언해도 된다.
        Triangle triangle = new Triangle(points);// Triangle의 point배열 입력해야함
        triangle.draw();// nullpointException
    }
}

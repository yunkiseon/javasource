package inheritance;

public class Point {
    int x;// x좌표
    int y;// y좌표

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);// 내 생성자 호출
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}

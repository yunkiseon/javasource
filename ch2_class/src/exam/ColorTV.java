package exam;

public class ColorTV extends TV {
    private int color;

    public ColorTV(int size) {
        super(size);
    }

    public ColorTV(int size, int color) {
        super(size);
        this.color = color;
    }

    void printProperty() {
        System.out.println(getSize() + "인치 " + color + "컬러");
    }

    public int getColor() {
        return color;
    }

}

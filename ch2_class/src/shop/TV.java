package shop;

public class TV extends Product {

    public TV(String name, int price, String resolution) {
        super(name, price);
        this.resolution = resolution;
    }

    private String resolution;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    void printExtra() {
        System.out.println("해상도" + resolution);
    }
}

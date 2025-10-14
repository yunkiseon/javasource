package shop;

public class CellPhone extends Product {

    public CellPhone(String name, int price, String carrier) {
        super(name, price);
        this.carrier = carrier;
    }

    private String carrier;

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @Override
    void printExtra() {
        System.out.println("통신사 정보 : " + carrier);
    }
}

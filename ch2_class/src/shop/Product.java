package shop;

public abstract class Product {
    private String name;
    private int price;

    void printDetail() {
        System.out.println("제품명 " + name);
        System.out.println("가격" + price);
        printExtra();

    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    abstract void printExtra();// 상품마다 추가되는 속성 출력

}
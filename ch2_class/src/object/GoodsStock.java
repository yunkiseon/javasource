package object;

public class GoodsStock {
    // 속성 : 상품명(p0001), 수량(10)
    String name;
    int amount;

    // 기본생성자
    // setter, getter 메소드

    // GoodsStock(){} 이렇게 안 만들어도 컴파일러가 자동으로 추가해준다
    // 하지만 매개변수 2 개를 초기화하는 것이 필요하다면 아래로 만들어야함 또한 생성자가 만들어져있다면, Ex에서 ()를 비울 수 없다.
    public GoodsStock(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public GoodsStock() {
    } // dafault 를 이렇게 만들어둔다면 Ex에서 () 사용가능해진다.

    // setter getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    // toString
    @Override
    public String toString() {
        return "GoodsStock [name=" + name + ", amount=" + amount + "]";
    }

}

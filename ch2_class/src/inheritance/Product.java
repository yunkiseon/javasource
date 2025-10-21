package inheritance;

public class Product {
    int price;
    int bonusPoint;

    public Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);

        // tv 가격, computer 가격 그리고 보너스를 주기 위해서 위의 코드를 만든 것.
    }

}

package shop;

public class ShopEx {
    public static void main(String[] args) {
        // TV tv = new TV("삼성TV", 2300000, "4K");
        // CellPhone cellPhone = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // 속성 초기화 1. 생성자 2. setter 메소드

        // TV[] tvs = new TV[3];
        // tvs[0] = new TV("삼성TV", 23000000, "4K");
        // tvs[1] = new TV("삼성TV", 23000000, "4K");
        // tvs[2] = new TV("삼성TV", 23000000, "4K");

        // CellPhone[] cellPhones = new CellPhone[3];
        // cellPhones[0] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // cellPhones[1] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // cellPhones[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");

        // Product, 자식개체 모두
        // Product[] products = new Product[5];
        // products[0] = new TV("삼성TV", 2300000, "4K");
        // products[1] = new TV("LGTV", 2250000, "4K");
        // products[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        // products[3] = new CellPhone("갤럭시S23", 600000, "SKT");
        // products[4] = new CellPhone("아이폰17", 1350000, "KT");

        // for (Product product : products) {
        // product.printDetail();
        // }

        // User user = new User("홍길동", PayType.CARD);
        MyShop myShop = new MyShop();
        // 이름 지정
        myShop.setTitle("내샵");
        // 사용자 등록
        myShop.genUser();
        // 상품 등록
        myShop.genProduct();
        myShop.start();
    }
}

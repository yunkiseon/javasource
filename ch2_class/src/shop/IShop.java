package shop;

public interface IShop {

    // 메뉴 화면
    void start();

    // 상품출력
    void productList();

    // 결제처리
    void checkOut();

    // 사용자등록
    void genUser();

    // 상품등록
    void genProduct();

}
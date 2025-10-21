package shop;

import java.util.Scanner;

import array.solo;

public class MyShop implements IShop {

    private String title;
    Product[] products = new Product[5];
    // 장바구니
    Product[] carts = new Product[5];
    // User
    User[] users = new User[2];
    // 선택된 사용자 idx 보관 변수
    private int selUser;

    public void setTitle(String title) {
        this.title = title;
    }

    // 메뉴 화면
    @Override
    public void start() {
        System.out.println(title + " : 메인화면 - 계정선택");
        System.out.println("====================================");
        int i = 0;
        for (User user : users) {
            System.out.printf("[%d]%s(%s)\n", i++, user.getName(), user.getPayType());
        }
        System.out.println("[x] 종료");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);

        String sel = sc.nextLine();

        switch (sel) {
            case "x":
            case "X":
                System.out.println("** 프로그램 종료**");
                System.exit(0);
                break;

            default:
                selUser = Integer.parseInt(sel);
                break;
        }

        // 선택된 user 정보 처리
        System.out.printf("## %s 선택##\n", sel);
        // sc.close();
        productList();

    }

    // 상품출력
    @Override
    public void productList() {
        System.out.println(title + "상품 목록 - 상품 선택");
        System.out.println("====================================");
        int i = 0;
        for (Product product : products) {
            System.out.printf("[%d] ", i++);
            product.printDetail();

        }
        System.out.println("[h] 메인 화면");
        System.out.println("[c] 체크 아웃");
        System.out.print("선택 : ");
        Scanner sc = new Scanner(System.in);
        // 사용자 입력 : 상품번호, h, c
        String sel = sc.nextLine();
        System.out.printf("## %s 선택##\n", sel);

        switch (sel) {
            case "h":
                start();
                break;
            case "c":
                checkOut();
                break;

            default:
                int no = Integer.parseInt(sel);

                for (int j = 0; j < carts.length; j++) {
                    if (carts[j] == null) {
                        carts[j] = products[no];
                        break;
                    }
                }
                productList();
                break;
        }
        // sc.close();
    }

    // 상품번호 0 선택 시 => cart 담기
    // carts[0] = products[no]; -> for 구문을 돌려서 빈 위치 찾기 -> 담기
    // 상품목록 보여주기
    // 상품번호 1 선택 시 => cart 담기
    // 상품목록 보여주기 => c 누르면 결제처리 메소드 호출
    // 상품목록 보여주기 => h -> 계정 선택

    // 결제처리. 그리고 유저정보를 전달받아서 저장하기. start에서 int menu 를 받아야한다.
    // 하지만 상속받은 메서드이기에 인자를 쓸 순 없다. start에선 productlist를 호출하지 checkOut을 호출하지 않기 때문이다.
    // 메서드가 그래서 변수의 선언 위치를 올려야하는 것이다. -> selUser 변수를 생성하여 정보 담기
    @Override
    public void checkOut() {
        System.out.println(title + "체크 아웃");
        System.out.println("==================================");
        int i = 0;
        int sum = 0;
        for (Product product : carts) {
            if (product != null) {
                System.out.printf("[%d] %s (%d)\n", i++, product.getName(), product.getPrice());
                sum += product.getPrice();
            }
        }
        System.out.println("==================================");
        System.out.println("결제 방법 : " + users[selUser].getPayType());
        System.out.println("합계 : " + sum);
        System.out.println("[p] 이전, [q] 결제 완료");
        System.out.println("선택 : ");
        Scanner sc = new Scanner(System.in);
        String sel = sc.nextLine();

        switch (sel) {
            case "q":
                System.out.println("### 결제가 완료되었습니다. 종료합니다. ###");
                System.exit(0);
                break;
            case "p":
                productList();
                break;
            default:
                checkOut();
                break;
        }
    }

    // 사용자등록
    @Override
    public void genUser() {
        // 2명 사용자 등록
        users[0] = new User("홍길동", PayType.CARD);
        users[1] = new User("성춘향", PayType.CASH);
    }

    // 상품등록
    @Override
    public void genProduct() {
        products[0] = new TV("삼성TV", 2300000, "4K");
        products[1] = new TV("LGTV", 2250000, "4K");
        products[2] = new CellPhone("갤럭시Z폴드", 1200000, "U+");
        products[3] = new CellPhone("갤럭시S23", 600000, "SKT");
        products[4] = new CellPhone("아이폰17", 1350000, "KT");
    }

}

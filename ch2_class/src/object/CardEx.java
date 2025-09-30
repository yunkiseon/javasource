package object;

public class CardEx {
    public static void main(String[] args) {
        // kind 인스턴스 변수 사용
        // 클래스 변수 : 클래스 이름.클래스변수
        // Card.cv = "";
        CardEx obj = new CardEx();
        Card card1 = new Card();
        card1.kind = "spade";
        card1.number = 2;
        // System.out.printf("card1 %d %s %d %d\n", card1.number, card1.kind,
        // Card.width, Card.height);
        // System.out.println("번호 : " + card1.number);
        // System.out.println("종류 : " + card1.kind);
        obj.info(card1);

        Card card2 = new Card();
        card2.kind = "spade";
        card2.number = 3;
        // System.out.printf("card2 %d %s %d %d\n", card2.number, card2.kind,
        // Card.width, Card.height);

        // System.out.println("번호 : " + card2.number);
        // System.out.println("종류 : " + card2.kind);
        obj.info(card2);

        Card.width = 80;
        Card.height = 60;

        System.out.printf("card1 %d %s %d %d\n", card1.number, card1.kind, Card.width, Card.height);

    }

    void info(Card card) {// static을 지우면, main이 실행되는 시점에 info 가 실행되지 않는다. 때문에, 인스턴스를 새로 생성없인 불가능하다
        System.out.println("번호 : " + card.number);
        System.out.println("종류 : " + card.kind);
        System.out.println("가로 : " + Card.width);
        System.out.println("세로 : " + Card.height);
    }
}

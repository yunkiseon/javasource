package inheritance;

public class CheckingTrafficCardAccount extends CheckingAccount {
    private boolean hasTrafficCard;

    public CheckingTrafficCardAccount(String accountNo, String owener, long balance, String cardNo,
            boolean hasTrafficCard) {
        super(accountNo, owener, balance, cardNo);
        // 은행 + 체크카드 + 교통카드
        this.hasTrafficCard = hasTrafficCard;
    }
    // 교통비 지급 메소드
    // 카드번호, 교통비 사용액을 인자로 받아서 카드번호가 일치하고 교통카드기능이 존재하면 지불한다
    // 교통카드 기능이 없다면 메세지 알려주기

    long payTrafficCard(String cardNo, long amount) throws Exception {
        if (!hasTrafficCard) {// 부모에 pay()가 있기 때문에 교통카드 기능 여부만 있으면 된다.
            throw new Exception("교통카드 기능이 없습니다");
        }
        return pay(cardNo, amount);

    }
}

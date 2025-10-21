package inheritance;

public class CheckingAccount extends Account {
    private String cardNo; // 직불카드 번호

    public CheckingAccount(String accountNo, String owener, long balance, String cardNo) {
        super(accountNo, owener, balance);
        this.cardNo = cardNo;
        // TODO Auto-generated constructor stub

    }

    // 직불카드 사용액을 지불한다
    long pay(String cardNo, long amount) throws Exception {
        // 카드번호 일치 -> 출금
        if (!this.cardNo.equals(cardNo)) {
            throw new Exception("카드번호 확인");
        }

        return withdraw(amount);

    }
}

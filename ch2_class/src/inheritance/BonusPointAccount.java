package inheritance;

public class BonusPointAccount extends Account {
    private int bonusPoint;

    public BonusPointAccount(String accountNo, String owener, long balance, int bonusPoint) {
        super(accountNo, owener, balance);
        this.bonusPoint = bonusPoint;
    }

    // 예금 + 보너스 포인트 적립
    @Override
    void deposit(long amount) {
        // 예금한다(부모꺼호출)
        super.deposit(amount);
        int point = (int) (amount * 0.01);
        bonusPoint += point;
        // 보너스포인트 적립
        // 예금액 1%

    }

    public int getBonusPoint() {
        return bonusPoint;
    }
}

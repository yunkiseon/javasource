package inheritance;

public class CreditLineAccount extends Account {
    private long creditLine;

    public CreditLineAccount(String accountNo, String owener, long balance, long creditLine) {
        super(accountNo, owener, balance);
        this.creditLine = creditLine;
    }

    // 마이너스 한도 : 100000(예금액)인데 + 5000000 만원까지 쓸 수 있게 해줌
    // 출금한다 -> 마이너스 한도까지 추가 출금 -> 오버라이딩 withdraw
    @Override
    long withdraw(long amount) throws Exception {
        long creditLineAccount = getBalance() + creditLine;
        if (amount > creditLineAccount) {
            throw new Exception("잔액부족");
        }
        if (amount <= getBalance()) {
            return super.withdraw(amount);
        } else {
            long remain = amount - getBalance();
            setBalance(0);
            creditLine -= remain;
            return getBalance();
        }

    }

    public long getCreditLine() {
        return creditLine;
    }
}

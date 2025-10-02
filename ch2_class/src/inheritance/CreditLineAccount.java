package inheritance;

public class CreditLineAccount extends Account {
    private int creditLine;

    public CreditLineAccount(String accountNo, String owener, long balance, int creditLine) {
        super(accountNo, owener, balance);
        this.creditLine = creditLine;
    }

    // 마이너스 한도 : 100000(예금액)인데 + 5000000 만원까지 쓸 수 있게 해줌
    // 출금한다 -> 마이너스 한도까지 추가 출금 -> 오버라이딩 withdraw
    @Override
    long withdraw(long amount) throws Exception {
        if (amount > super.getBalance() + creditLine) {
            throw new Exception("마이너스 한도 확인");
        }
        setBalance(getBalance() - amount);
        return super.getBalance();
    }

}

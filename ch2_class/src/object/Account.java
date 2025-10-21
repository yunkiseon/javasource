package object;

public class Account {
    // 은행계좌
    // 계좌번호(120-12-111), 계좌주(홍길동), 잔액(100000)

    private String accountNo;// private 가 붙는 순간, 해당 클래스에서만 접근 가능해짐
    private String owener;
    private long balance;

    // 입금한다(잔액 = 잔액 + 입금액) -> 입금액을 인자로 받아서 처리 리턴타입 없음, deposit
    // 출금한다(잔액 = 잔액 - 출금액) -> 출금액을 인자로 받아서 처리 잔액 리턴, withdraw

    public Account(String accountNo, String owener, long balance) {
        this.accountNo = accountNo;
        this.owener = owener;
        this.balance = balance;
    }

    void deposit(long amount) {
        balance += amount;
    }

    long withdraw(long amount) {
        balance -= amount;
        return balance;
    }

    // 속성 값 조회 : get~~~
    public String getAccountNo() {
        return accountNo;
    }

    public long getBalance() {
        return balance;
    }

    public String getOwener() {
        return owener;
    }

}

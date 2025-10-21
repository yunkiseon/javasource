package inheritance;

import java.util.Scanner;

public class Account {
    // 은행계좌
    // 계좌번호(120-12-111), 계좌주(홍길동), 잔액(100000)

    private String accountNo;// private 가 붙는 순간, 해당 클래스에서만 접근 가능해짐
    private String owener;
    private long balance;
    Scanner sc = new Scanner(System.in);

    // 입금한다(잔액 = 잔액 + 입금액) -> 입금액을 인자로 받아서 처리 리턴타입 없음, deposit
    // 출금한다(잔액 = 잔액 - 출금액) -> 출금액을 인자로 받아서 처리 잔액 리턴, withdraw

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public Account(String accountNo, String owener) {
        // this.accountNo = accountNo; 위에 있기 때문에
        this(accountNo); // 위의 것과 선택해서 초기화해도 된다. this -> 나 자신의 것을 의미
        this.owener = owener;
    }

    public Account(String accountNo, String owener, long balance) {
        this.accountNo = accountNo;
        this.owener = owener;
        this.balance = balance;
    }

    void deposit(long amount) {
        balance += amount;
    }

    long withdraw(long amount) throws Exception {// 잔액 안에서 출금허용
        if (amount > balance) {
            // return; -> void가 아니여서 사용불가
            throw new Exception("잔액부족");// Exception 즉, 오류를 발생시켜서 아래 실행하지 않고 멈춤
        }
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

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setOwener(String owener) {
        this.owener = owener;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owener=" + owener + ", balance=" + balance + "]";
    }

}

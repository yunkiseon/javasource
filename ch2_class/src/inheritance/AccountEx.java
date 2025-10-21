package inheritance;

public class AccountEx {
    public static void main(String[] args) throws Exception {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");

        // 입금
        checkingAccount.deposit(200000);
        // 입금 후 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());

        CreditLineAccount creditLineAccount = new CreditLineAccount("111", "홍길동", 100000, 5000000);
        System.out.println(" 잔액 : " + creditLineAccount.withdraw(3000000));
        // System.out.println(" 잔액 : " + creditLineAccount.withdraw(3000000));

        BonusPointAccount bonusPointAccount = new BonusPointAccount("111", "홍길동", 0, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("현재 보너스포인트 : " + bonusPointAccount.getBonusPoint());
        bonusPointAccount.deposit(200000);
        System.out.println("현재 보너스포인트 : " + bonusPointAccount.getBonusPoint());
        // 직불카드 사용
        // try {
        // System.out.println("체크카드 지불 후 잔액 : " + checkingAccount.pay("111-22",
        // 350000));
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        CheckingTrafficCardAccount cardAccount = new CheckingTrafficCardAccount("111", "홍길동", 100000, "222", false);
        CheckingTrafficCardAccount cardAccount2 = new CheckingTrafficCardAccount("333", "성춘향", 100000, "444", true);
        // cardAccount.deposit(10000);
        // System.out.println("출금 후 잔액 " + cardAccount.payTrafficCard("222", 10000));
        cardAccount2.deposit(10000);
        System.out.println("출금 후 잔액 " + cardAccount2.withdraw(50000));
        System.out.println("교통비 지급 후 잔액 " + cardAccount2.payTrafficCard("444", 2100));

    }
}

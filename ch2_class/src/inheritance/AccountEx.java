package inheritance;

public class AccountEx {
    public static void main(String[] args) throws Exception {
        CheckingAccount checkingAccount = new CheckingAccount("111", "홍길동", 100000, "111-22");

        // 입금
        checkingAccount.deposit(200000);
        // 입금 후 잔액
        System.out.println("잔액 : " + checkingAccount.getBalance());

        BonusPointAccount bonusPointAccount = new BonusPointAccount("222", "성춘향", 200000, 0);
        bonusPointAccount.deposit(100000);
        System.out.println("예금잔액 잔액 : " + bonusPointAccount.getBalance());
        System.out.println("보너스포인트 : " + bonusPointAccount.getBonusPoint());

        CreditLineAccount creditLineAccount = new CreditLineAccount("333", "장기하", 1000000, 5000000);
        creditLineAccount.withdraw(2000000);
        System.out.printf("마이너스통장 출금 가능액 : %d, 마이너스통장 잔액 : %d", creditLineAccount.getCreditLine(),
                creditLineAccount.getBalance());
        // 직불카드 사용
        // try {
        // System.out.println("체크카드 지불 후 잔액 : " + checkingAccount.pay("111-22",
        // 350000));
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

    }
}

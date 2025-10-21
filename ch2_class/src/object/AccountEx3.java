package object;

import java.util.Scanner;

public class AccountEx3 {
    static Scanner sc = new Scanner(System.in);// 이렇게 클래스 열자마자 입력되는 멤버변수로 지정하면 각 메소드마다 입력할 필요는 없다.

    public static void main(String[] args) {

        // 배열 생성 new int[], new Account[3]...
        Account[] accounts = new Account[100];

        boolean run = true;
        while (run) {
            System.out.println("-------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("선택 >>> ");
            int no = Integer.parseInt(sc.nextLine());

            switch (no) {
                case 1:
                    createAccount(accounts);
                    break;

                case 2:
                    accountList(accounts);
                    break;

                case 3:
                    deposit(accounts);
                    break;

                case 4:
                    withdraw(accounts);
                    break;

                case 5:
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("메뉴 번호 확인");
                    break;
            }
        }

    }

    static void createAccount(Account[] accounts) {
        // 계좌 생성

        System.out.print("계좌번호 입력 : ");
        String accountNo = sc.nextLine();// 멤버변수로 Scanner를 지정해도 안됨
        System.out.print("계좌주 입력 : ");
        String owner = sc.nextLine();
        System.out.print("잔액 입력 : ");
        int balance = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < accounts.length; j++) {
            if (accounts[j] == null) {
                accounts[j] = new Account(accountNo, owner, balance);
                break;
            }
        }
    }

    static void withdraw(Account[] accounts) {
        // 출금 담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            System.out.print("출금액 >> ");
            int amount = Integer.parseInt(sc.nextLine());
            long balance = account.withdraw(amount);
            System.out.println("현재 잔액 : " + balance);// Account.java에 withdraw에는 리턴이 있어서 가능
        }
    }

    static void deposit(Account[] accounts) {
        // 입금 담당
        Account account = findAccount(accounts);
        if (account == null) {
            System.out.println("계좌번호 확인");
        } else {
            // 입금액을 입력받고 계좌잔액에 추가
            // account.getBalance() + 입력받은 입금액 원래라면 이렇게 해야하나 Account.java에 deposit이 있기에.
            System.out.print("입금액 >> ");
            int amount = Integer.parseInt(sc.nextLine());
            account.deposit(amount);

        }
    }

    static Account findAccount(Account[] accounts) {
        // 입력받은 계좌번호와 일치하는 계좌 찾기
        System.out.print("계좌번호 입력 >> ");
        String accountNo = sc.nextLine();

        for (Account account : accounts) {
            if (account != null) {
                if (account.getAccountNo().equals(accountNo)) {
                    return account;
                }
            }
        }
        return null;
    }

    static void accountList(Account[] accounts) {
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("==================================");
                System.out.println("1. 계좌번호 : " + account.getAccountNo());
                System.out.println("2. 계좌주 : " + account.getOwener());
                System.out.println("3. 잔액 : " + account.getBalance());
                System.out.println("==================================");
            }
        }
    }
}

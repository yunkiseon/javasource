package lombok2;

public class AccounEx {
    public static void main(String[] args) {
        Account account = new Account("홍길동", "110", 1);
        
        account.getName();
        account.setAccNo(null);

        System.out.println(account);//toString 확인

        Account account2 = new Account();
        account2.setAccNo("220");
        account2.setBalance(20000);
        account2.setName("성춘향");

        Account.builder().build();

        Account account3 = Account.builder()
                .accNo("330")
                .balance(25000)
                .name("가가가가")
                .build();

        

    }
}

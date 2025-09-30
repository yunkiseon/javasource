package object;

public class SubscriberInfoEx {
    public static void main(String[] args) {
        SubscriberInfo info = new SubscriberInfo();
        // 속성 변경(초기화)
        // 1. 직접접근 : private 사용하면 불가
        // 2. 생성자
        // 3. 메소드 : set~~~
        info.setName("홍길동");
        info.setId("sjdkci12");
        info.chagePassword("akjci1233");
        info.chagePhone("010-1234-5678");

        // 가입자 정보 조회
        // 1. 간단조회 : toString -> 개발자 확인용으로 사용
        System.out.println("개인정보 : " + info.toString());// == info. toString() 자동으로 호출됨
        // 2. 개별조회: get~~
        System.out.println("이름 : " + info.getName());
        System.out.println("아이디 : " + info.getId());
        System.out.println("비밀번호 : " + info.getPassword());
        System.out.println("전화번호 : " + info.getPhone());
    }
}

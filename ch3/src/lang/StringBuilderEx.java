package lang;

public class StringBuilderEx {
    public static void main(String[] args) {
        // 인스턴스 생성
        StringBuilder builder = new StringBuilder();
        // StringBuilder builder2 = "new StringBuilder()"; 이건 안됨 String이 예외인 것

        String str1 = "abc";
        String str2 = str1.concat("bcd"); // 새로운 문자열로 생성

        // 원본변경
        builder.append("abc").append("bcd").append("def");
        System.out.println(builder);// 원본 변경 가능. StringBuffer는 멀티쓰레드, Builder는 단일쓰레드의 차이만 있다. abcbcddef

        builder.delete(0, 2);
        System.out.println(builder);// 끝 위치 포함 안하고 삭제 cbcddef
        builder.deleteCharAt(0);
        System.out.println(builder);// 0번위치 삭제 bcddef
        builder.insert(1, "홍길동");
        System.out.println(builder); // b홍길동cddef
        builder.replace(1, 3, "성춘향");
        System.out.println(builder);// b성춘향동cddef

        builder = new StringBuilder("Hello");
        StringBuilder builder2 = new StringBuilder("Hello");

        System.out.println(builder.equals(builder2) ? "같음" : "다름");
        // StringBuilder 를 String으로 바꾸기

        str1 = builder.toString();
        str2 = new String(builder2);
        System.out.println(str1.equals(str2));

        String str3 = "안녕하세요";
        str3 += "반갑습니다";
        str3 += "Hello";
        // 위의 방식은 str3에 덧붙이는 것이 아닌, 완전히 없애고 새로 생성하는 것이다.
    }
}

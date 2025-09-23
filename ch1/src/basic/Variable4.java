package basic;

public class Variable4 {
    public static void main(String[] args) {
        // 논리형: 참과 거짓을 표현하고 싶을 때
        boolean flag = false;
        System.out.println(flag ? "아이스크림" : "팥빙수");
        // 문자형
        char ch = 'a', ch2 = '가';
        // chat ch3 = 'ab'; 틀림
        // 문자열 : ""
        // String ch3 = "a";
        System.out.println("ch = " + ch + ", ch2 =" + ch2);
        System.out.printf("ch = %10c, ch2 = %5c\n", ch, ch2);
        System.out.println("ch = " + (ch + 1)); // 98 즉 a = 97 이라는 뜻, A 의 경우 65임
        System.out.println("ch2 = " + (ch2 + 1)); // 44033
        System.out.printf("ch2 = %c\n", (ch2 + 1)); // 각
        System.out.printf("ch2 = %d\n", (ch2 + 1)); // 44033
    }
}

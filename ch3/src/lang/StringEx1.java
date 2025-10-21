package lang;

public class StringEx1 {
    public static void main(String[] args) {
        // 1. 인스턴스 생성
        // String str1 = new String("abc"); 아래와 동일
        String str1 = "abcdefg";

        // 문자열을 낱개로 처리하고 싶다. abc가 a, b, c 가 합쳐진 개념음 'a', 'b', 'c'로 나누고 싶다 :
        // charAt(인덱스번호)
        // System.out.println(str1.charAt(0));
        // System.out.println(str1.charAt(1));
        // System.out.println(str1.charAt(2));

        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }
        char[] ch = { 'A', 'B', 'C', 'D' };
        // char 배열 -> 문자열로 변경
        String str2 = new String(ch);
        System.out.println(str2);
    }
}

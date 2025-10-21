package lang;

public class StringEx3 {
    public static void main(String[] args) {

        String str1 = "Hello World";
        StringBuilder builder = new StringBuilder(str1);
        System.out.println(builder.reverse());

        // 문자열 거꾸로 출력하기
        System.out.println("dlroW olleH");
        for (int i = str1.length() - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }

    }
}

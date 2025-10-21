package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        String[] strArr = { "Kim", "Park", "Yi" };
        System.out.println(Arrays.toString(strArr));

        String[] strArr2 = new String[3];
        strArr2[0] = "Kim";
        strArr2[1] = "Park";
        strArr2[2] = "Yo";

        // System.out.println(strArr[0].length());

        // char 배열과 String 배열
        // String : char 배열 + 기능(메서드)
        System.out.println(strArr2[0]);
        System.out.println("strArr2[0].charAt(0)" + strArr2[0].charAt(0));// K 출력

        String src = "ABCDE";
        for (int i = 0; i < src.length(); i++) {
            System.out.println(src.charAt(i));
        }
        // String -> char 배열
        char[] chArr2 = src.toCharArray();
        // char 배열 -> String
        char[] chArr = { 'A', 'B', 'C', 'D', 'E' };
        String str2 = new String(chArr);
        System.out.println(str2);

    }
}

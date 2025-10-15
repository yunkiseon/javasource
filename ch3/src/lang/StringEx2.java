package lang;

import java.lang.reflect.Array;
import java.util.Arrays;

// String
// mutable -> immutable(변경불가)
// StringBuffer, String Builder
public class StringEx2 {
    public static void main(String[] args) {
        // 1. concat() : 다른 문자열 뒤에 덧붙이기
        String str1 = "Hello";
        String str2 = " World";
        String str3 = str1 + str2;
        System.out.println(str3);
        // 리턴타입 존재 - 1) 출력문 2) 변수
        System.out.println(str1.concat(str2));

        // 2. contains() : 문자열 포함 여부
        boolean result = str3.contains(str1);
        System.out.println(result);
        if (str3.contains(str1)) {
            System.out.println("str3 문자열에 str1 문자열이 포함됨");
        } else {
            System.out.println("str3 문자열에 str1 문자열이 포함되지 않음");
        }
        // 3. compareTo() : 문자열을 사전순서로 비교 -> 정렬 등을 쓸 때 사용됨
        str1 = "aaa";
        str2 = "bbb";
        System.out.println("str1.compareTo(aaa) = " + str1.compareTo("aaa"));// 0 -> str1 에 aaa가 있는데, aaa와 비교하니 동일
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2));// -1 앞은 aaaa 뒤는 bbb a보다는 b가 뒤에 있음
        System.out.println("str2.compareTo(str1) = " + str2.compareTo(str1));// 1

        // 4. endWith() : 지정된 문자열로 끝나는지 검사 -> 확장자 확인 가능
        String fileName = "file1.txt";
        if (fileName.endsWith("txt")) {
            System.out.println("텍스트 파일");
        } else {
            System.out.println("텍스트 파일 아님");
        }
        // 5. equals() : 문자열 비교, equalsIgnoreCase() : 대소문자 비교하지 말고 비교
        System.out.println("aaa".equals("ccc"));
        System.out.println("aaa".equalsIgnoreCase("AAA"));

        // 6. indexOf() : 문자열에서 문자의 위치값 리턴
        str1 = "Hello";
        System.out.println("str1.indexOf('e') " + str1.indexOf('e'));// 1
        System.out.println("str1.indexOf('k') " + str1.indexOf('k'));// -1 -> 못찾으면
        System.out.println("str1.indexOf('e') " + str1.indexOf('e', 2));// -1 왜냐면 e는 1에 위치했는데 2부터 찾으라고 해서
        System.out.println("str1.indexOf('el') " + str1.indexOf("el"));// 1 -> 단어여도 시작위치를 찾아준다.

        // 7. lastIndexOf() : 뒤에서부터 탐색하여 위치값 리턴
        str1 = "java.lang.Object";
        System.out.println("str1.lastIndexOf('.') " + str1.lastIndexOf('.'));// 9
        System.out.println("str1.indexOf('.') " + str1.indexOf('.'));// 4

        // 8. length() : 문자열 길이
        int arr[] = { 3, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
        }
        // 9. replace() : 단어 변환-> 원본 문자열에 변화를 주진 않음
        str1 = "Hello";
        System.out.println(str1.replace('H', 'K'));// Kello
        // System.out.println(str1); -> Hello
        System.out.println("Hellollo".replace("ll", "LL"));// HeLLoLLo -> 전체를 바꾸어줌
        System.out.println("Hellollo".replaceAll("ll", "LL"));// HeLLoLLo -> 전체를 바꾸어줌
        // replace 와 replaceAll과의 차이. target, regex의 차이. regex는 정규식이라는 의미.
        System.out.println("Hellollo".replaceFirst("ll", "LL"));// HeLLoLLo -> 첫번째만 바꾸어줌

        // 10. split()
        String animals = "dog, cat, bear";
        String[] arr2 = animals.split(",");
        System.out.println(arr2);// [Ljava.lang.String;@6b884d57
        System.out.println(Arrays.toString(arr2));// 클래스명.메소드명 으로 불리었기에 static 메소드임을 알 수 있다. dog, cat, bear
        for (String s : arr2) {
            System.out.println(s);// dog,cat,bear
        }
        String[] arr3 = animals.split(",", 2);// 크게 두 개로 분리해줘 라는 의미
        System.out.println("animals.split(,2)" + Arrays.toString(arr3));

        for (String s : arr3) {
            System.out.println(s);
        }

        // 11. startsWith() : endsWith와 반대. 앞의 문자열 일치
        str1 = "java.lang.Object";
        System.out.println("str1.startWith(\"java\")" + str1.startsWith("java"));// true
        System.out.println("str1.startWith(\"lang\")" + str1.startsWith("lang"));// false
        System.out.println("str1.startWith(\"lang\")" + str1.startsWith("lang", 5));// true

        // 12. substring(beginIndex) : 시작위치부터 문자열 얻어내기
        // substring(endIndex) : 시작위치 ~ 끝 위치까지 but endIndex 미포함하여 문자열 얻어내기
        System.out.println(str1.substring(10));// Objcet
        System.out.println(str1.substring(5, 9));// lang

        // 13. toLowerCase() / toUpperCase
        System.out.println("abcdefg".toUpperCase());// ABCDEFG
        System.out.println("AbcdEfg".toLowerCase());// abcdefg

        // 14. trim() : 양 끝에 존재하는 공백. 중간 공백은 안해줌
        System.out.println("                                Hello World".trim());// Hello World
        System.out.println("                     Hello World           ".trim());// Hello World
        System.out.println("                Hello                 World".trim());// Hello World

        // 15. valueOf() : 지정된 값을 문자열로 변환하여 반환
        String str4 = String.valueOf(5);
        int i = 3;
        str4 = i + "";
        str4 = String.valueOf(10.3f);

    }
}

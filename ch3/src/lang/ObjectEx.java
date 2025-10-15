package lang;

import java.util.Scanner;

public class ObjectEx {
    public static void main(String[] args) {
        // String str = new String();
        // String str1 = new String();
        // String str1 = "Hello"; string을 그만큼 많이 써서, new 할 필요가 없게 하였다.

        Scanner sc = new Scanner(System.in);// import 자동으로 입력됨. import 구문이 java.lang의 경우 default로 import 해줌.그러나 scanner은
                                            // java.lang이 아니여서.

        // 모든 클래스들의 부모 : Object
        Object object1 = new Object();
        Object object2 = new Object();

        if (object1.equals(object2)) {
            System.out.println("같다");
        } else {
            System.out.println("다르다");
        }
        System.out.println(object1 == object2 ? "두 객체는 같다" : "두 객체는 다르다");
        System.out.println("object1" + object1);// object1java.lang.Object@7a81197d -> 패키지명.클래스명@16진수

        String str1 = "Hello", str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1.equals(str2) ? "str1 == str2" : "str1 != str2");// 같다
        System.out.println(str1.equals(str3) ? "str1 == str3" : "str1 != str3");// 같다
        System.out.println(str1 == str2 ? "str1 == str2" : "str1 != str2"); // 같다
        System.out.println(str1 == str3 ? "str1 == str3" : "str1 != str3"); // 다르다
        // str1 과 2는 같은 장소에 넣어졌고 str3은 new로 만들었다.
        // 그런데 의문점 - 주소를 비교했는데 왜 같다고 나오는가? 값 비교를 했기에 그런 것이다. 즉, equals를 부모가 넘겨준 대로 쓰지
        // 않고(주소비교) 값비교한 것이다(오버라이딩)

        Value value1 = new Value(10);
        Value value2 = new Value(10);
        System.out.println(value1.equals(value2));// false -> equals 라는 메소드는 Object에 있어서 그렇다
        // new 를 할 때마다 heap 이라는 저장공간에 새로 생긴다.
        // 부모가 원래 가지고 있는 equals는 주소가 같냐고 묻는 것이다. 주소 비교의 개념
        // value.java에 if 구문을 한 뒤엔 true로 출력된다.
        System.out.println(value1);// lang.Value@4f023edb value.java에서 toString 오버라이딩 뒤엔 10출력됨
        System.out.println("str3 " + str3);// Hello 라는 값출력
        sc.close();

    }

}

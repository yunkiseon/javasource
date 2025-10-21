package object;

// 변수
// 1. 인스턴스(속성, 멤버, 필드)변수 : 클래스 영역에 선언, 인스턴스가 생성되야 사용가능
// 2. 클래스 변수 : 클래스 영역에 선언 (static 이라는 변수가 있으면 클래스 변수) -> 클래스가 메모리에 올라갈 때 쓸 수 있다.(공유)
// 3. 지역 변수 : 메서드 영역, 생성자 영역에 매개 변수, 생성자 내부에 선언
public class Card {

    // private String kind;// 인스턴스 변수
    // static String cv;//클래스 변수-> 중복되는 것들을 통합하여 적용시켜 메모리 효율을 높임
    // void print(int i) {//지역변수
    // int j = 0; //지역변수
    // }

    String kind;
    int number;
    static int width = 100;
    static int height = 150;

}

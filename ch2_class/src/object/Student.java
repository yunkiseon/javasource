package object;

public class Student {
    // main 이 없는 클래스
    // 클래스 안의 요소들 : 멤버변수, 멤버메소드, 생성자

    // 멤버변수
    // 이름(홍길동), 전화번호(010-123-5678), 주소(서울시 종로구 25)
    String name;
    String tel;
    String address;

    // 생성자(Constructor)-ex) Source Action-Generatic Constructors
    // 생성자는 클래스명을 따라간다.
    public Student() {
    }

    // 메소드-이미 정의한 String에 따라서 get**의 형식으로 가능
    public String getName() {// geetter 메소드 멤버변수의 값 가져오는 역할
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    // 이름을 변경하는 메소드 생성
    // 리턴타입 메소드명 (매개변수1, 매개변수 2,...)[]
    // void + 기본타입(int, float, double, boolean, char ...)+ 참조타입(String, []...)
    // void changeName(String name) {// Ex에 적은 성천사는 String으로 저장해야하기 때문에, () 안에
    // String 과 변수명 삽입
    // this.name = name; //setter 와 같은 영향을 끼침
    // }

    // 리턴타입이 있는 경우
    String changeName(String name) {// Ex에 적은 성천사는 String으로 저장해야하기 때문에, () 안에 String 과 변수명 삽입
        this.name = name; // setter 와 같은 영향을 끼침
        return this.name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", tel=" + tel + ", address=" + address + "]";
    }

}

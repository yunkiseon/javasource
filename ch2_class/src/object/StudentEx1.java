package object;

public class StudentEx1 {
    public static void main(String[] args) {
        // 객체 생성(new)-> 메모리 위치에 이라는 Student라는 형식을 가짐 = 인스턴스 생성

        Student obj = new Student();

        // 생성된 인스턴스의 초기화(값을 넣는 행위)
        obj.name = "홍길동";
        obj.tel = "010-1234-5678";
        obj.address = "서울시 종로구 25";

        // 메소드 호출
        // 1) 결과 반환이 되는 경우 : 변수에 담거나 혹은 print 구문 썼을 때
        // 2) 결과 반환이 없는 경우 : 호출만 하기(void)
        // obj.getAddress();
        // System.out.println(obj.getAddress());
        // 멤버변수 값 변경
        Student student = new Student();
        student.setName("성춘향");
        student.setTel("010-5678-8596");
        student.setAddress("경기도 수원시");
        // System.out.println(student);
        // 멤버변수 값 가져오기
        System.out.println(student.getName());
        student.changeName("성천사");

        // 홍길동의 이름 바꾸기
        // obj.changeName("홍장군");
        // System.out.println(obj);
    }
}

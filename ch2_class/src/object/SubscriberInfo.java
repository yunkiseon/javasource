package object;

public class SubscriberInfo {
    // 가입자 정보
    // 이름, 아이디(영어, 숫자), 비밀번호(영어, 숫자, 특수문자), 전화번호(010-1234-5678)
    // name, id,password, phone
    private String name;
    private String id;
    private String password;
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }
    // public void setPassword(String password) { 아래에 생성한 기능과 동일한 기능이 중복되서
    // this.password = password;
    // }
    // public void setPhone(String phone) {
    // this.phone = phone;
    // }

    // 기능: 비밀번호 변경, 전화번호 변경
    // chagepassword
    // chagephone
    void chagePassword(String password) {
        this.password = password;
    }

    void chagePhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    // 필드(멤버 변수)가 가지고 있는 값 출력
    @Override
    public String toString() {
        return "SubscriberInfo [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
    }

}

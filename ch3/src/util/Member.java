package util;

public class Member {
    private String id;
    private String password;
    private String name;

    public Member(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;

    }

    public Member() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", password=" + password + ", name=" + name + "]";
    }
    // 아이디가 같으면 같은 Member 라고 인식하기
    // HashCode(), equals() 재정의 필요하다 -> source action으로 부르기

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member other = (Member) obj;
            return id.equals(other.id);
        }
        return false;
    }

}

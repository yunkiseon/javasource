package lang;

public class LoginEx {
    public static void main(String[] args) {

        try {
            // login("white", "12345");
            login("blue", "54321");
        } catch (NotExistIDException | WrongPasswordException e) {
            e.printStackTrace();
        }
    }

    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {// 던지기
        // id가 blue 가 아니라면 NotExistIDException 발생
        if (!id.equals("blue")) {
            throw new NotExistIDException("아이디 확인");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호 확인");
        }

        // password가 12345 가 아니라면 WrongPasswordException 발생

    }
}

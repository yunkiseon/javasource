package emp;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    public static void main(String[] args) {
        // db 서버 연결
        // 아래의 과정은 매번 해주어야만 한다.
        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";// localhost: 실제 데이터베이스 서버가 설치된 위치, 1521 포트 번호, 오라클xe의 이름
                                                               // 이 세 개는 바뀔 수도 있다.
            String user = "scott";
            String password = "tiger";
            // DB 연결
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("연결되었습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

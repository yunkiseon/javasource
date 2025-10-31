package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Update {
    public static void main(String[] args) {
        // db 서버 연결
        // 아래의 과정은 매번 해주어야만 한다.
        try {
            // 1. 드라이버 로드
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "scott";
            String password = "tiger";
            // DB 연결
            Connection con = DriverManager.getConnection(url, user, password);

            // 3. sql 구문, update
            String sql = "update emp set sal = 1500 where empno = 7499";
            // ResultSet 객체는 select 일 때만 쓴다. executeQuery 도 마찬가지
            PreparedStatement pstmt = con.prepareStatement(sql);
            int result = pstmt.executeUpdate();
            System.out.println(result > 0 ? "업데이트 성공" : "업데이트 실패");
            // update 성공한 행의 갯수만 알려주기 때문에

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

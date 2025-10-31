package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Select2 {
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

            // 3. sql 구문, select
            String sql = "select * from emp where empno = 7499";

            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("empno") + "\t");
                System.out.println(rs.getString("ename") + "\t");
                System.out.println(rs.getString("job") + "\t");
                System.out.println(rs.getInt("mgr") + "\t");
                System.out.println(rs.getDate("hiredate") + "\t");
                System.out.println(rs.getInt("sal") + "\t");
                System.out.println(rs.getInt("comm") + "\t");
                System.out.println(rs.getInt("deptno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

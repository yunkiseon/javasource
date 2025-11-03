package student2.repository;

import static student2.repository.JDBCUtil.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import student2.dto.DeptDTO;

public class DeptDAO {
    // Data Access Object : 데이터베이스 관련 작업
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs; // 메법변수로 선언하면 기본적으로 null 이라 null 선언 필요 없다.

    public DeptDAO(Connection con) {
        this.con = con;
    }
    // 데이터베이스 연결 메소

    // 항상 excuteUpdate 를 해서 int 값으로 돌아오기 때문에. int result를 씀
    // 값을 받아올 때 직접 가져오거나 dto로 넘겨서 dto를 가져온다
    public int insert(DeptDTO dto) {
        int result = 0;
        try {

            String sql = "INSERT INTO DEPARTMENT VALUES(? , ?)";
            pstmt = con.prepareStatement(sql);

            pstmt.setString(1, dto.getDeptId());
            pstmt.setString(2, dto.getDeptName());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt); // JDBCUtil 을 임포트하지 않았다면 JDBCUtil.close(pstmt) 라고 해야함
        }
        return result;
    }

    public int delete(String deptId) {
        int result = 0;
        try {

            String sql = "delete from department where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    public int update(DeptDTO dto) {
        int result = 0;
        try {

            String sql = "update department set dept_name =? where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, dto.getDeptName());
            pstmt.setString(2, dto.getDeptId());
            result = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(pstmt);

        }
        return result;
    }

    // select의 경우 rs = pstmt.executeQuerey 값으로 돌아옴
    // 조회결과가 하나만 나오는 특정 학과 조회
    // 만약 dept_name =? 이 아니라 like 를 사용하면 중복된 결과값이 출력될 가능성이 있기 때문에 list를 사용해야 한다.

    public DeptDTO getRow(String deptName) {
        DeptDTO deptDTO = null;
        try {

            String sql = "select * from department where dept_name = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptName);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                deptName = rs.getString("dept_name");
                deptDTO = new DeptDTO(deptId, deptName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return deptDTO;
    }

    // 전체학과 조회 메소드
    public List<DeptDTO> getRows() {
        List<DeptDTO> list = new ArrayList<>();
        try {

            String sql = "select * from department";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            // 위까지는 department 객체를 가져온 것이다. 때문에 RS에 담겨진 내용들을 DTO에 다시 담는 작업이 필요하다
            while (rs.next()) {
                String deptId = rs.getString("dept_id");
                String deptName = rs.getString("dept_name");

                // DeptDTO deptDTO = new DeptDTO(deptId, deptName);
                // list.add(deptDTO); 아래와 동일
                list.add(new DeptDTO(deptId, deptName));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);

        }

        return list;
    }

}

// 까지가 DAO의 가장 기본적인 형태이다. DTO나 main 은 당연히 다양한 형태이지만 DAO는 이 틀 안에서만 변화가 있다.

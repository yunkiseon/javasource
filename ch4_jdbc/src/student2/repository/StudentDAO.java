package student2.repository;

import static student2.repository.JDBCUtil.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student2.dto.StudentDTO;

public class StudentDAO {
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public StudentDAO(Connection con) {
        this.con = con;
    }

    // insert
    public int insert(StudentDTO sDto) {
        int result = 0;
        try {
            String sql = "INSERT INTO STUDENT(student_id, name, height, dept_id) VALUES(?, ?, ?, ?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sDto.getStudentId());
            pstmt.setString(2, sDto.getName());
            pstmt.setDouble(3, sDto.getHeight());
            pstmt.setString(4, sDto.getDeptId());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // delete studentId
    public int delete(String studentId) {
        int result = 0;
        try {
            String sql = "DELETE FROM student WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;
    }

    // update : height 수정
    public int update(StudentDTO sDto) {
        int result = 0;
        try {
            String sql = "UPDATE student SET height = ? WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setDouble(1, sDto.getHeight());
            pstmt.setString(2, sDto.getStudentId());
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }
        return result;

    }

    // 학생 전체 조회 deptId 사용

    public List<StudentDTO> getList(String deptId) {
        List<StudentDTO> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM STUDENT where dept_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, deptId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                StudentDTO sDto = new StudentDTO();
                sDto.setStudentId(rs.getString("student_id"));
                sDto.setName(rs.getString("name"));
                sDto.setHeight(rs.getDouble("height"));
                sDto.setDeptId(rs.getString("dept_Id"));
                list.add(sDto);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return list;
    }

    // 학생 개별 조회 -> studentId 사용
    public StudentDTO getRow(String studentId) {
        StudentDTO sDto = null;
        try {
            String sql = "SELECT * FROM STUDENT WHERE student_id = ?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, studentId);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                sDto = new StudentDTO();
                sDto.setStudentId(rs.getString("student_id"));
                sDto.setName(rs.getString("name"));
                sDto.setHeight(rs.getDouble("height"));
                sDto.setDeptId(rs.getString("dept_id"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return sDto;
    }

}

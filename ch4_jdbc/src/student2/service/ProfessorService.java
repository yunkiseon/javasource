package student2.service;

import java.sql.Connection;
import java.sql.SQLException;

import student2.dto.ProfessorDTO;
import static student2.repository.JDBCUtil.*;
import student2.repository.ProfessorDAO;

public class ProfessorService {
    // DAO <===> Service <====> controller
    public boolean insertProfessor(ProfessorDTO dto) {
        Connection con = null; // student2.rep~util.*;을 static으로 해서 가능
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int rows = dao.insert(dto);

            if (rows > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }
        return false;
    }

    public boolean updateProfessor(ProfessorDTO dto) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int rows = dao.update(dto);

            if (rows > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }
        return false;
    }

    public boolean deleteProfessor(String profId) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            int rows = dao.delete(profId);

            if (rows > 0) {
                commit(con);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            rollback(con);
        } finally {
            close(con);
        }
        return false;
    }

    public ProfessorDTO getProfessor(String profId) {
        Connection con = null;
        try {
            con = getConnection();
            ProfessorDAO dao = new ProfessorDAO(con);
            ProfessorDTO dto = dao.getRow(profId);
            return dto;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(con);
        }
        return null;
    }
}

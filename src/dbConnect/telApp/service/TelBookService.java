package dbConnect.telApp.service;

import dbConnect.telApp.db.DBConn;
import dbConnect.telApp.dto.TelDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelBookService {
    public int inserData(TelDTO dto) {
        int result = 0;

        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        String sql;
        try {
            sql = "insert into telbook(name, age, addr, tel) " + "values (?,?,?,?)";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, dto.getName());
            psmt.setInt(2, dto.getAge());
            psmt.setString(3, dto.getAddress());
            psmt.setString(4, dto.getTelNum());

            result = psmt.executeUpdate(); // 실행
            psmt.close(); // 다 썼으면 닫아주기
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}

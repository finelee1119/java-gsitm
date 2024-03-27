package dbConnect.telApp_1.service;

import dbConnect.telApp_1.db.DBConn;
import dbConnect.telApp_1.dto.TelDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    public int insertData(TelDto dto) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "insert into telbook(name, age, addr, tel) values(?, ?, ?, ?)";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, dto.name());
            psmt.setInt(2, dto.age());
            psmt.setString(3, dto.addr());
            psmt.setString(4, dto.tel());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int updateData(TelDto dto) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "update telbook set name = ?, age = ?, addr = ?, tel = ? where id = ?";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, dto.name());
            psmt.setInt(2, dto.age());
            psmt.setString(3, dto.addr());
            psmt.setString(4, dto.tel());
            psmt.setInt(5, dto.id());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int deleteData(int id) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "delete from telbook where id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, id);

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public List<TelDto> selectAll() {
        List<TelDto> dtoList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            String query = "select * from telbook order by id";
            psmt = conn.prepareStatement(query);
            rs = psmt.executeQuery();

            while (rs.next()) {
                dtoList.add(TelDto.allOf (
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("addr"),
                        rs.getString("tel")
                        )
                );
            }
            psmt.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return dtoList;
    }


    public TelDto selectOne(int id) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        TelDto dto = null;
        try {
            String query = "select * from telbook where id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, id);
            rs = psmt.executeQuery();

            while (rs.next()) {
                dto = TelDto.allOf(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("addr"),
                        rs.getString("tel")
                );
            }
            psmt.close();
            rs.close();
            return dto;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

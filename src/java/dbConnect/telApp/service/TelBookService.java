package java.dbConnect.telApp.service;

import java.dbConnect.telApp.db.DBConn;
import java.dbConnect.telApp.dto.TelDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelBookService {
    // 1. 데이터 입력
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

    // 2. 데이터 수정
    public int updateData(TelDTO dto) {
        int result = 0;
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        String sql;
        try {
            sql = "update telbook set name = ?, age = ?, addr = ?, tel = ? where id = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, dto.getName());
            psmt.setInt(2, dto.getAge());
            psmt.setString(3, dto.getAddress());
            psmt.setString(4, dto.getTelNum());
            psmt.setInt(5, dto.getId());

            result = psmt.executeUpdate(); // 실행
            psmt.close(); // 다 썼으면 닫아주기
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    // 3. 데이터 삭제하기
    public int deleteData(int id) {
        int result = 0;

        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        String sql;
        try {
            sql = "delete from telbook where id=?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    // 4. 전체 데이터 가져오기
    public List<TelDTO> getListAll() {
        List<TelDTO> dtoList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "select * from telbook order by id";
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()) {
                dtoList.add(TelDTO.allOf(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("addr"),
                        rs.getString("tel")
                ));
            }
            rs.close();
            psmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return dtoList;
    }

    // 5. 아이디 검색
    public TelDTO searchOne(int id) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        String sql;
        TelDTO dto = null;
        try {
            sql = "select * from telbook where id = ?";
            psmt = conn.prepareStatement(sql);
            psmt.setInt(1, id);
            rs = psmt.executeQuery();
            while (rs.next()) {
                dto = TelDTO.allOf(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("addr"),
                        rs.getString("tel")
                        );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return dto;

    }


}

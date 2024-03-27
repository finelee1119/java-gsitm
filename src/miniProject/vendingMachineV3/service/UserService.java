package miniProject.vendingMachineV3.service;

import miniProject.vendingMachineV3.db.DBConn;
import miniProject.vendingMachineV3.dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {
    public int signUpService(UserDto userDto) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;

        try {
            String query = "insert into user(id, pw, user_name, tel) values(?, ?, ?, ?)";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, userDto.id());
            psmt.setString(2, userDto.pw());
            psmt.setString(3, userDto.userName());
            psmt.setString(4, userDto.tel());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public UserDto signInService(String id, String pw) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        UserDto userDto = null;

        try {
            String query = "SELECT pw FROM user WHERE id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setString(1, id);
            rs = psmt.executeQuery();

            if (rs.next()) {
                String pwFromDB = rs.getString("pw");
                if (pwFromDB.equals(pw)) {
                    System.out.println("로그인에 성공했습니다.");
                } else {
                    System.out.println("로그인에 실패했습니다.");
                }
            }

            psmt.close();
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return userDto;
    }

    public int getBalance(String id) throws SQLException {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int balance = 0;

        try {
            conn = DBConn.getConnection();
            String query = "SELECT balance FROM user WHERE id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setString(1, id);
            rs = psmt.executeQuery();

            if (rs.next()) {
                balance = rs.getInt("balance");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return balance;
    }





}

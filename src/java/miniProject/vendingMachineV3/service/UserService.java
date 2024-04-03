package java.miniProject.vendingMachineV3.service;

import java.miniProject.vendingMachineV3.db.DBConn;
import java.miniProject.vendingMachineV3.dto.UserDto;

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


    public boolean signInService(String id, String pw) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        UserDto userDto = null;
        boolean signInYes = false;

        try {
            String query = "SELECT pw FROM user WHERE id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setString(1, id);
            rs = psmt.executeQuery();

            if (rs.next()) {
                String pwFromDB = rs.getString("pw");
                if (pwFromDB.equals(pw)) {
                    signInYes = true;
                }
            }

            psmt.close();
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return signInYes;
    }


    public int updateBalance(String id, int amount) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int currentBalance = 0;
        int newBalance = 0;

        try {
            // 현재 잔액 조회
            String selectQuery = "SELECT balance FROM user WHERE id = ?";
            psmt = conn.prepareStatement(selectQuery);
            psmt.setString(1, id);
            rs = psmt.executeQuery();

            if (rs.next()) {
                currentBalance = rs.getInt("balance");
            }

            // 새로운 잔액 계산
            newBalance = currentBalance + amount;

            // 잔액 업데이트
            String updateQuery = "UPDATE user SET balance = ? WHERE id = ?";
            psmt = conn.prepareStatement(updateQuery);
            psmt.setInt(1, newBalance);
            psmt.setString(2, id);
            psmt.executeUpdate();

            // 닫기
            psmt.executeUpdate();
            psmt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return newBalance;
    }


    public int getBalance(String id) {
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


    public int returnAllBalance(String id) {
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        int currentBalance = 0;
        int newBalance = 0;

        try {
            // 현재 잔액 조회
            String selectQuery = "SELECT balance FROM user WHERE id = ?";
            psmt = conn.prepareStatement(selectQuery);
            psmt.setString(1, id);
            rs = psmt.executeQuery();

            if (rs.next()) {
                currentBalance = rs.getInt("balance");
            }

            // 전액 환불 계산
            newBalance = currentBalance - currentBalance;

            // 잔액 업데이트
            String updateQuery = "UPDATE user SET balance = ? WHERE id = ?";
            psmt = conn.prepareStatement(updateQuery);
            psmt.setInt(1, newBalance);
            psmt.setString(2, id);
            psmt.executeUpdate();

            // 닫기
            psmt.executeUpdate();
            psmt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return newBalance;
    }
}

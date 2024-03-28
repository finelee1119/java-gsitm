package miniProject.vendingMachineV3.service;

import miniProject.vendingMachineV3.db.DBConn;
import miniProject.vendingMachineV3.dto.ProductDto;
import miniProject.vendingMachineV3.dto.UserDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagerService {

    public int insertVendingMachineData(ProductDto dto){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "insert into product(product_name, price, stock) values(?, ?, ?)";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, dto.productName());
            psmt.setInt(2, dto.price());
            psmt.setInt(3, dto.stock());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    public int updateVendingMachineData(ProductDto dto){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "update product set product_name = ?, price = ?, stock = ? where product_id = ?";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, dto.productName());
            psmt.setInt(2, dto.price());
            psmt.setInt(3, dto.stock());
            psmt.setInt(4, dto.productId());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    public int deleteVendingMachineData(int productId){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "delete from product where product_id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, productId);

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    public List<ProductDto> showAllVendingMachineData(){
        List<ProductDto> dtoList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            String query = "select * from product order by product_id";
            psmt = conn.prepareStatement(query);
            rs = psmt.executeQuery();

            while (rs.next()) {
                dtoList.add(ProductDto.allOf (
                                rs.getInt("product_id"),
                                rs.getString("product_name"),
                                rs.getInt("price"),
                                rs.getInt("stock")
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
    public ProductDto showOneVendingMachineData(int productId){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        ProductDto productDto = null;

        try {
            String query = "select * from product where product_id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setInt(1, productId);
            rs = psmt.executeQuery();

            while (rs.next()) {
                productDto = ProductDto.allOf(
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getInt("price"),
                        rs.getInt("stock")
                );
            }
            psmt.close();
            rs.close();
            return productDto;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ///////////////////////////////////////////////////////////////////
    public int insertUserData(UserDto dto){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "insert into user(id, pw, user_name, tel) values(?, ?, ?, ?)";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, dto.id());
            psmt.setString(2, dto.pw());
            psmt.setString(3, dto.userName());
            psmt.setString(4, dto.tel());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    public int updateUserData(UserDto dto){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "update user set id = ?, pw = ?, user_name = ?, tel = ? where id = ?";
            psmt = conn.prepareStatement(query);

            psmt.setString(1, dto.id());
            psmt.setString(2, dto.pw());
            psmt.setString(3, dto.userName());
            psmt.setString(4, dto.tel());
            psmt.setString(5, dto.id());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    public int deleteUserData(String id){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "delete from user where id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setString(1, id);

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return result;
    }
    public List<UserDto> showAllUserData(){
        List<UserDto> dtoList = new ArrayList<>();
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            String query = "select * from user order by id";
            psmt = conn.prepareStatement(query);
            rs = psmt.executeQuery();

            while (rs.next()) {
                dtoList.add(UserDto.allOf (
                                rs.getString("id"),
                                rs.getString("pw"),
                                rs.getString("user_name"),
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
    public UserDto showOneUserData(String id){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        ResultSet rs = null;
        UserDto userDto = null;

        try {
            String query = "select * from user where id = ?";
            psmt = conn.prepareStatement(query);
            psmt.setString(1, id);
            rs = psmt.executeQuery();

            while (rs.next()) {
                userDto = UserDto.allOf(
                        rs.getString("id"),
                        rs.getString("pw"),
                        rs.getString("user_name"),
                        rs.getString("tel")
                );
            }
            psmt.close();
            rs.close();
            return userDto;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    ///////////////////////////////////////////////////////////////////
    // 제품별 판매현황 조회
    public void showProductSalesData(){

    }

    // 회원별 판매현황 조회
    public void showUserSalesData(){

    }


}

package java.miniProject.vendingMachineV3.service;

import java.miniProject.vendingMachineV3.db.DBConn;
import java.miniProject.vendingMachineV3.dto.ProductDto;
import java.miniProject.vendingMachineV3.dto.SalesDto;
import java.miniProject.vendingMachineV3.dto.UserDto;

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
    public void updateSalesData(SalesDto salesDto){
        Connection conn = DBConn.getConnection();
        PreparedStatement psmt = null;
        int result = 0;
        try {
            String query = "INSERT INTO sales (product_id, user_id) VALUES (?, ?)";
            psmt = conn.prepareStatement(query);

            psmt.setInt(1, salesDto.productId());
            psmt.setString(2, salesDto.userId());

            result = psmt.executeUpdate();
            psmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }


    public SalesDto showProductSalesData() {
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        SalesDto salesDto = new SalesDto(0, null); // SalesDto 객체 초기화

        try {
            conn = DBConn.getConnection();
            String query = "SELECT p.product_name, COUNT(s.sales_id) AS 제품별판매수량, SUM(p.price) AS 제품별판매금액\n" +
                    "FROM sales s\n" +
                    "JOIN product p ON s.product_id = p.product_id\n" +
                    "GROUP BY p.product_id, p.product_name";
            psmt = conn.prepareStatement(query);

            rs = psmt.executeQuery();

            while (rs.next()) {
                String productName = rs.getString("product_name");
                int salesId = rs.getInt("제품별판매수량"); // 판매수량 가져오는 부분
                int totalPrice = rs.getInt("제품별판매금액"); // 판매금액 가져오는 부분

                // SalesDto 객체에 데이터 설정
                salesDto = new SalesDto(salesDto.productId(), salesDto.userId()); // 여기서 0은 productId로 설정하는 부분입니다.
            }
            psmt.close();
            rs.close();
            return salesDto;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


//    public SalesDto showProductSalesData(){
//        //제품명, 판매수량, 판매금액, 맨 아래에 총 판매금액 출력
//        Connection conn = DBConn.getConnection();
//        PreparedStatement psmt = null;
//        ResultSet rs = null;
//        ProductDto productDto = null;
//        SalesDto salesDto =  null;
//
//        try {
//            String query = "SELECT p.product_name, COUNT(s.sales_id) AS 제품별판매수량, SUM(p.price) AS 제품별판매금액\n" +
//                    "FROM sales s\n" +
//                    "JOIN product p ON s.product_id = p.product_id\n" +
//                    "GROUP BY p.product_id, p.product_name";
//            psmt = conn.prepareStatement(query);
//
//            psmt.setString(1, productDto.productName());
//            psmt.setInt(2, salesDto.salesId());
//            psmt.setInt(3, productDto.price());
//            psmt.setInt(4, salesDto.productId());
//            psmt.setInt(5, productDto.productId());
//            psmt.setInt(6, productDto.productId());
//            psmt.setString(7, productDto.productName());
//
//            rs = psmt.executeQuery();
//
//            while (rs.next()) {
//                salesDto = salesDto.allOf(
//                        rs.getInt("id"),
//                        rs.getInt("product_id"),
//                        rs.getString("user_id")
//                );
//            }
//            psmt.close();
//            rs.close();
//            return salesDto;
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    // 회원별 판매현황 조회
    public void showUserSalesData(){
        //회원아이디, 회원명, 구매금액, 충전잔액
    }


}

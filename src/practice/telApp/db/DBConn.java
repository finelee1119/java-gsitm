package practice.telApp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    private static Connection dbConn;

    public static Connection getConnection() {
        if (dbConn == null) {
            try {
                String dbDriver = "com.mysql.jdbc.Driver";
                String dbUrl = "jdbc:mysql://localhost:3306/teldb";
                String dbUser = "teluser";
                String dbPassword = "1111";
                Class.forName(dbDriver);
                dbConn = DriverManager.getConnection(dbUrl,dbUser,dbPassword);
                System.out.println("성공");
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return dbConn;
    }
}

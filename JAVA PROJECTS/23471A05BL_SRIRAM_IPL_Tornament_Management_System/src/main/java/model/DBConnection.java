package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    static Connection conn;
    
    public static Connection getConnection() {
        try {
            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Connection details
            String url = "jdbc:mysql://localhost:3306/ipl_db";
            String user = "root";
            String password = "passwordMysql@52";  // Change to your password
            
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("✓ Connected to database!");
        } catch (Exception e) {
            System.out.println("✗ Error: " + e);
        }
        return conn;
    }
}

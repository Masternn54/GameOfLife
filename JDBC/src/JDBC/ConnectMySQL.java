/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nichlas
 */
public class ConnectMySQL {
     private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONN_STRING
            = "jdbc:mysql://localhost/explorecalifornia";

    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
       
        try {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        System.out.println("Connected! ");
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (conn != null) {
                conn.close();    }
            
        

    }
}
}




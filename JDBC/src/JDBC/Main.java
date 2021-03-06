/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nichlas
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
 //           conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
              conn = DBUtill.getConnection(DBType.MYSQL);

            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM states");

            rs.last();
            System.out.println("Number of rows: " + rs.getRow());

            //      System.out.println("Connected! ");
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (rs != null) {
                rs.close();    }
            
            if (stmt != null) {
                stmt.close();    }
            
            if (conn != null) {
                conn.close();    }
        }

    }
}

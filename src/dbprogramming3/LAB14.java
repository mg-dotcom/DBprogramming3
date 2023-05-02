/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprogramming3;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DatabaseMetaData;

public class LAB14 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "momor123";   
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            DatabaseMetaData meta = con.getMetaData();
            System.out.println("database URL: " + meta.getURL());
            System.out.println("database Product Name: " + meta.getDatabaseProductName());
            System.out.println("database Product Version: " + meta.getDatabaseProductVersion());
            System.out.println("database Driver Name: " + meta.getDriverName());
            System.out.println("database Driver Version: " + meta.getDriverVersion());
            con.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB14.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB14.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

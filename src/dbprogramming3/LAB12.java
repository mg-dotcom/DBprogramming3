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

public class LAB12 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "momor123";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            String sql = "insert into student(studentID,firstName,lastName,email,deptID)" 
                    + "values(?,?,?,?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, "55555");
            preparedStatement.setString(2, "Jack");
            preparedStatement.setString(3, "Ryan");
            preparedStatement.setString(4, "jack.rya@gmail.com");
            preparedStatement.setString(5, "IT");
            preparedStatement.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprogramming3;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Dbprogramming3 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "momor123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = con.createStatement();
            String sql = "select * from student";
            ResultSet results = statement.executeQuery(sql);
           
            while (results.next()){
                System.out.println(results.getString(1)+" "+results.getString(2)+" "+results.getString(3)
                                   +" "+results.getString(4));
            }
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprogramming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

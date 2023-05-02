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
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class LAB15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "momor123";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "select * from student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = results.getMetaData();
            
            for(int i = 1; i <= rsMetaData.getColumnCount();i++){
                System.out.println(rsMetaData .getColumnName(i));
            }
            
            while (results.next()) {
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++)
                    System.out.printf("%-12s\t", results.getObject(i));
                System.out.println();
            }
            con.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


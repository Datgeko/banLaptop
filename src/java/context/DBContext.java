/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DatGeko
 */
public class DBContext {
   private static String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
   private static String url="jdbc:sqlserver://localhost:1433;databaseName=SellLaptop";
   private static String user="sa";
   private static String password="123a@";
    public static  Connection getConnection(){
          Connection conn=null;
       try {
           Class.forName(driver);
           conn=DriverManager.getConnection(url, user, password);
           
           
       } catch (ClassNotFoundException | SQLException ex) {
           Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
       }
       return conn;
       
    }
    public static void main(String[] args) {
       getConnection();
    }
}

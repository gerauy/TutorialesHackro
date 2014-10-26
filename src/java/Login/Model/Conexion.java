/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login.Model;

import java.sql.DriverManager;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import java.sql.SQLException;

/**
 *
 * @author hackro
 */
public class Conexion
{
    
    public static final String USERNAME = "u373424449_root";
    public static final String PASSWORD = "DavidHackro";
    public static final String HOST = "185.28.21.141";
    public static final String PORT = "3306";
    public static final String DATABASE = "u373424449_david";
    public static final String CLASSNAME = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://"+ HOST +":"+PORT+"/"+DATABASE;
    
     public java.sql.Connection con;
     
    
    
       public Conexion() {
  
        try {
           Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            System.out.println("Error");
        } catch (SQLException e) {
            System.out.println("Error");
        }
}
       
       public static void main(String args[])
       {
           Conexion con = new Conexion();
       }
       
      
}

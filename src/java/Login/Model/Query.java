/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Login.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hackro
 */
public class Query extends Conexion{
    
    
      String Table1 = "Usuarios";
      
    public Boolean Autentication(String user,String pass) throws SQLException {
        ResultSet rs = null;
        boolean opt = false;
        Statement st = con.createStatement();
        String Query = "Select * from " + Table1 + "";
        rs = st.executeQuery(Query);

        while (rs.next()) {
            if (rs.getString("password").equals(pass) && rs.getString("user").equals(user)) {
                opt = true;
                con.close();
                break;
            }
        }
        con.close();
        return opt;
    }
    
    public static void main(String args[])
    {
        Query q = new Query();
       // System.out.println();q.Autentication("", "")
    }
}

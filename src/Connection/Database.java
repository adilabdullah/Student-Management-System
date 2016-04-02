/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Connection;
import java.sql.*;
/**
 *
 * @author Adil
 */
public class Database {
    ResultSet rs;
    Connection con;
    Statement st;
    public Connection Conn()
      {
     try{
          Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
    st=con.createStatement();
    return con;
     }
     catch(Exception ex)
     {
     ex.printStackTrace();
     return null;
     }
      }
}

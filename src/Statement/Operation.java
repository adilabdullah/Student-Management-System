/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Statement;
import Connection.Database;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Adil
 */
public class Operation {
    Connection con;
    Statement st;
    ResultSet rs;
PreparedStatement pst;
    public ResultSet displayall(String table)
{
try{
    Database dt=new Database();
    con=dt.Conn();
    st=con.createStatement();
String sql="SELECT * FROM "+table;
rs=st.executeQuery(sql);
return rs;
}
catch(Exception ex)
{
ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());
return null;
}
}
public int datediff(Date dd,Date de)
{
int st=dd.getYear();
int se=de.getYear();
return se-st;
}
    
public ResultSet display(String nam,String table)
{
try{
    Database dt=new Database();
    con=dt.Conn();
    st=con.createStatement();
String sql="SELECT * FROM "+table+" WHERE name='"+nam+"'";
rs=st.executeQuery(sql);
return rs;
}
catch(Exception ex)
{
ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());
return null;
}
}
    
    
public void insert()
{
try{
    Database dt=new Database();
    con=dt.Conn();
    st=con.createStatement();
String sql="INSERT INTO info(name,father,class,section,roll,gr,dob,doa,gender) VALUES (?????????)";

rs=st.executeQuery(sql);
}
catch(Exception ex)
{
ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());
}
}

//public void datediff()
//{
//try{
//    Database dt=new Database();
//    con=dt.Conn();
//    st=con.createStatement();
//String sql="";
//
//rs=st.executeQuery(sql);
//}
//catch(Exception ex)
//{
//ex.printStackTrace();
//JOptionPane.showMessageDialog(null,ex.getMessage());
//}
//}
}

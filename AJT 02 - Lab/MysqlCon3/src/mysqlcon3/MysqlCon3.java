package mysqlcon3;
import java.sql.*;
public class MysqlCon3 {

public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/db3","root","");  
    Statement stmt=con.createStatement();  
    ResultSet rs=stmt.executeQuery("select * from emp");  
    ResultSetMetaData rsmd = rs.getMetaData();
    System.out.println("Data from table: " + rsmd.getTableName(1));
    System.out.println(rsmd.getColumnName(1) + " \t" + 
            rsmd.getColumnName(2) + " \t\t" +  rsmd.getColumnName(3) ); 
    while(rs.next())  
    System.out.println(rs.getInt(1)+" \t"+rs.getString(2)+" \t\t"+rs.getString(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
}  
}  
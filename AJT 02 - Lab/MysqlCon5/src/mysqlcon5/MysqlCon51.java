package mysqlcon5;
import java.sql.*;  
public class MysqlCon51 {
public static void main(String args[]){  
try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/db5","root","");  
    Statement stmt=con.createStatement();  
    
    int result = stmt.executeUpdate("insert into emp values(3, 'abcd', 'Rajkot')");
    System.out.println(result + " record inserted.");
    
    ResultSet rs=stmt.executeQuery("select * from emp");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
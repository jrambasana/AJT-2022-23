package mysqlcon;
import java.sql.*;  
public class MysqlCon1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","");  
Statement stmt = con.createStatement();  

int result = stmt.executeUpdate("insert into emp values (1, 'abc', 'Pune')");
System.out.println(result + " record inserted");

ResultSet rs = stmt.executeQuery("select * from emp");  
while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
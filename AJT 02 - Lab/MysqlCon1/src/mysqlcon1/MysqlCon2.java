package mysqlcon1;
import java.sql.*;  

public class MysqlCon2 {
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db11","root","");  
Statement stmt = con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from emp");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  

CallableStatement csmt = con.prepareCall("{call getName(?,?)}");
int id = 3;
String name="";

csmt.setInt(1, id);
csmt.setString(2, name);
csmt.registerOutParameter(2, java.sql.Types.VARCHAR);
csmt.execute();
name = csmt.getString(2);
System.out.println("Name = " + name);

con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
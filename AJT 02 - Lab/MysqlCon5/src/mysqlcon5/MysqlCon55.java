package mysqlcon5;
import java.sql.*;  
import java.util.Scanner;

public class MysqlCon55 {
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","");  
CallableStatement stmt = con.prepareCall("{call getCity(?,?)}");
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter id: ");
int id = sc.nextInt();
String city = "";
stmt.setInt(1, id);
stmt.setString(2, null);
stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
stmt.execute();
city = stmt.getString(2);
System.out.println("City is: "+city);
}catch(Exception e){ System.out.println(e);}  
}  
}  
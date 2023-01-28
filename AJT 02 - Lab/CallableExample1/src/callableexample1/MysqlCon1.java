package callableexample1;

import java.sql.*;  
import java.util.Scanner;

class MysqlCon1{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","");  
//here sonoo is database name, root is username and password  
CallableStatement stmt=con.prepareCall("{call getCity(?,?)}");  
Scanner sc = new Scanner(System.in);
System.out.print("Enter id: ");
int id = sc.nextInt();
stmt.setInt(1, id);
String city = "";
stmt.setString(2, city);
stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
stmt.execute();
city = stmt.getString(2);
System.out.println("City = "+city);
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
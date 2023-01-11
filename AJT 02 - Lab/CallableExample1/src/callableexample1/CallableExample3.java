package callableexample1;

import java.sql.*;  
import java.util.Scanner;

public class CallableExample3 {

public static void main(String[] args) throws Exception
{
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/db1","root","");  
CallableStatement stmt = con.prepareCall( "{call getName(?,?)}" );
Scanner sc = new Scanner(System.in);
System.out.print("\n Enter id: ");
int id = sc.nextInt();
String name = "";
stmt.setInt(1,id);  
stmt.execute(); //result
name = stmt.getString(2);
System.out.println("Name is: "+name);

stmt = con.prepareCall( "{call getCity(?,?)}" );
String city = "";
stmt.setInt(1, id);
stmt.execute();
city = stmt.getString(2);
System.out.println("City is: "+city);

}  
}

package callableexample1;

import java.sql.*;  
import java.util.Scanner;

public class CallableExample2 {

public static void main(String[] args) throws Exception
{
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/test","root","");  
    CallableStatement stmt = con.prepareCall( "{call insertR(?,?)}" );  
   
    Scanner sc = new Scanner(System.in);
    System.out.print("\n Enter id: ");
    int id = sc.nextInt();
    System.out.print("\n Enter name: ");
    String name = sc.next();
    
    stmt.setInt(1,id);  
    stmt.setString(2, name);  
    boolean res = stmt.execute(); 
    
    if (res == false)
        System.out.println("Rows affected: " + stmt.getUpdateCount());  
    else
        System.out.println("failure");
}  
}

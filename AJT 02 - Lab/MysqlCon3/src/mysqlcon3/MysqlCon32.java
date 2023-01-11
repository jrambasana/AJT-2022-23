package mysqlcon3;
import java.sql.*;
import java.util.Scanner;
public class MysqlCon32 {

public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/db3","root","");  
    
    Scanner sc = new Scanner(System.in);
    System.out.print("\n Enter id: ");
    int id = sc.nextInt();
    System.out.print("\n Enter name: ");
    String name = sc.next();
    System.out.print("\n Enter city: ");
    String city = sc.next();
    
    PreparedStatement stmt = con.prepareStatement("insert into emp values(?,?,?)");
    stmt.setInt(1, id);
    stmt.setString(2, name);
    stmt.setString(3, city);
    
    int result = stmt.executeUpdate();
    System.out.println(result + " record inserted");
    
    ResultSet rs=stmt.executeQuery("select * from emp");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
}  
}  
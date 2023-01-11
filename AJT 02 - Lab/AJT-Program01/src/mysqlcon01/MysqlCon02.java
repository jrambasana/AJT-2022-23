
package mysqlcon01;
import java.sql.*;
import java.util.Scanner;
public class MysqlCon02 {
public static void main(String args[]){  
    try{  
    Class.forName("com.mysql.jdbc.Driver");  
    Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/test3","root","");
    
    Scanner sc = new Scanner(System.in);
    System.out.print("\n Enter the id: ");
    int id = sc.nextInt();
    System.out.print("\n Enter the name: ");
    String name = sc.next();
    System.out.print("\n Enter the city: ");
    String city = sc.next();
    
    PreparedStatement pstmt = 
    con.prepareStatement("insert into emp values (?,?,?)");
    pstmt.setInt(1, id);
    pstmt.setString(2, name);
    pstmt.setString(3, city);
    
    int result = pstmt.executeUpdate();
    System.out.println("Rows inserted: " + result);
    
    ResultSet rs=pstmt.executeQuery("select * from emp");  
    while(rs.next())  
    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
    con.close();  
    }catch(Exception e){ System.out.println(e);}  
}  
}  